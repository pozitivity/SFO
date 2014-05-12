package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.TypeUserDao;
import ru.rest.model.JsonTypeUsers;
import ru.rest.model.converter.TypeUserToJsonConverter;


@Component
@Path("/typeUser")
@Scope("request")
public class TypeUserResource{
	@Autowired
	private TypeUserDao typeUserService;
	
	@GET
	@Path("typeUsers")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllTypeUsers(){
		JsonTypeUsers jTypeUsers = TypeUserToJsonConverter.convertEntityListToJsonList(typeUserService.findAll());
		return Response.ok(jTypeUsers).build();
	}
}