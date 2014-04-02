package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonUsers;
import ru.rest.model.converter.UserToJsonConverter;
import ru.service.UserService;


@Component
@Path("/userService")
public class UserResource{
	@Autowired
	private UserService userService;
	
	@GET
	@Path("users")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllUsers(){
		JsonUsers jUsers = UserToJsonConverter.convertEntityListToJsonList(userService.findAll());
		return Response.ok(jUsers).build();
	}
}