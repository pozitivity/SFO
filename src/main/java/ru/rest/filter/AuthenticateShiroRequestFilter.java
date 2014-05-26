package ru.rest.filter;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

public class AuthenticateShiroRequestFilter implements ContainerRequestFilter {
	
	@Override
	public ContainerRequest filter(ContainerRequest request) throws WebApplicationException {			
		if (request.getPath().contains("authentication/")) {
			return request;
		}
		if (request.getPath().contains("rubric/")) {
			return request;
		}
		if (request.getPath().contains("city/")) {
			return request;
		}
		if (request.getPath().contains("sendmail/")) {
			return request;
		}
		
		if (request.getPath().contains("logo/")) {
			return request;
		}
		
		if (request.getPath().contains("organization/")) {
			return request;
		}
		
		if (request.getPath().contains("user/")) {
			return request;
		}
		
		Subject subject = SecurityUtils.getSubject();
		if (!subject.isAuthenticated()) {
			  throw new WebApplicationException(Status.UNAUTHORIZED);
		}
		return request;	 
	}

}
