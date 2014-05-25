package ru.rest;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.business.UserBusiness;
import ru.session.UserSession;
import ru.security.UserNamePasswordTokenEx;
import ru.domain.User;


@Component
@Path("/authentication")
@Scope("request")
public class AuthenticationResource implements Serializable {

	@Autowired 
	UserBusiness userBusiness;
	
	@Autowired
	private UserSession userSession;
	
	@POST
	@Path("/login")
	public Response login(@FormParam("login") String login, @FormParam("password") String password,
			@HeaderParam("X-Real-IP") String realIp, @HeaderParam("User-Agent") String userAgent){
		
		Subject subject = SecurityUtils.getSubject();
		
		if (userSession.isLocked()) {
			userSession.loginRejected(realIp, userAgent, login, "Session is locked");
			return Response.status(Response.Status.UNAUTHORIZED).entity("You have been BANNED").build();
		}
		
		if (!subject.isAuthenticated()) {			
			try {
				subject.login(new UserNamePasswordTokenEx(login, password, userBusiness));
				userSession.loggedIn(realIp, userAgent, login);
				return Response.noContent().build();
			} catch (UnknownAccountException uae) {
				String failureReason = "No such account";
				userSession.loginFailed(realIp, userAgent, login, failureReason);
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (IncorrectCredentialsException ice) {
				String failureReason = "Invalid credentials";
				userSession.loginFailed(realIp, userAgent, login, failureReason);
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (LockedAccountException lae) {
				String failureReason = "Account locked";
				userSession.loginFailed(realIp, userAgent, login, failureReason);
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (AuthenticationException ae) {
				String failureReason = "Unknown authentication error";
				userSession.loginFailed(realIp, userAgent, login, failureReason);
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			}
		}
		return Response.ok("Already authenticated").build();
	}
	
	@Path("/logout")
    @POST
    public Response logout(@HeaderParam("X-Real-IP") String realIp, @HeaderParam("User-Agent") String userAgent) {
		Subject subject = SecurityUtils.getSubject();
		String login = subject.getPrincipal().toString();
		
		subject.logout();
		
		userSession.loggedOut(realIp, userAgent, login);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
	
	@Path("/isauthenticated")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response isAuthenticated() {
    	Subject subject = SecurityUtils.getSubject();
    	return Response.ok(Boolean.toString(subject.isAuthenticated())).build();
    }
    
    public User getCurrentUser() {
    	Subject subject = SecurityUtils.getSubject();
    	return userBusiness.findByLogin(subject.getPrincipal().toString());
    }
}
