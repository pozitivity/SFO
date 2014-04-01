package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonLogos;
import ru.rest.model.converter.LogoToJsonConverter;
import ru.service.LogoService;


@Component
@Path("/logoService")
public class LogoResource{
	@Autowired
	private LogoService logoService;
	
	@GET
	@Path("logo")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllLogos(){
		JsonLogos jLogos = LogoToJsonConverter.convertEntityListToJsonList(logoService.findAll());
		return Response.ok(jLogos).build();
	}
}
