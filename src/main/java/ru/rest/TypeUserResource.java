package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonTypeUsers;
import ru.rest.model.converter.TypeUserToJsonConverter;
import ru.service.TypeUserService;


@Component
@Path("/typeUserService")
public class TypeUserResource{
	@Autowired
	private TypeUserService typeUserService;
	
	@GET
	@Path("typeUser")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllTypeUsers(){
		JsonTypeUsers jTypeUsers = TypeUserToJsonConverter.convertEntityListToJsonList(typeUserService.findAll());
		return Response.ok(jTypeUsers).build();
	}
}