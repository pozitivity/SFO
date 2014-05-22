package ru.rest;

import java.io.Serializable;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
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
	public Response login(@FormParam("login") String login, @FormParam("password") String password){
		
		Subject subject = SecurityUtils.getSubject();
		
		if (!subject.isAuthenticated()) {			
			try {
				subject.login(new UserNamePasswordTokenEx(login, password, userBusiness));
				return Response.noContent().build();
			} catch (UnknownAccountException uae) {
				String failureReason = "No such account";
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (IncorrectCredentialsException ice) {
				String failureReason = "Invalid credentials";
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (LockedAccountException lae) {
				String failureReason = "Account locked";;
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			} catch (AuthenticationException ae) {
				String failureReason = "Unknown authentication error";
				return Response.status(Response.Status.UNAUTHORIZED).entity(failureReason).build();
			}
		}
		return Response.ok("Already authenticated").build();
	}
	
	@Path("/logout")
    @POST
    public Response logout(@HeaderParam("X-Real-IP") String realIp, @HeaderParam("User-Agent") String userAgent) {
		Subject subject = SecurityUtils.getSubject();
		//String username = subject.getPrincipal().toString();
		
		subject.logout();
		
		//userSession.loggedOut(realIp, userAgent, username);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
