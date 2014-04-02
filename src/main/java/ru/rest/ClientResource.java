package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonClients;
import ru.rest.model.converter.ClientToJsonConverter;
import ru.service.ClientService;


@Component
@Path("/clientService")
public class ClientResource{
	@Autowired
	private ClientService clientService;
	
	@GET
	@Path("clients")
	@Produces({MediaType.APPLICATION_JSON  + ";charset=utf-8"})
	public Response getAllClients(){
		JsonClients jClients = ClientToJsonConverter.convertEntityListToJsonList(clientService.findAll());
		return Response.ok(jClients).build();
	}
}