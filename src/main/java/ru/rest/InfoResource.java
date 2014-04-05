package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ru.rest.model.JsonInfos;
import ru.rest.model.converter.InfoToJsonConverter;
import ru.service.InfoService;


@Component
@Path("/infoService")
public class InfoResource{
	@Autowired
	private InfoService infoService;
	
	@GET
	@Path("infos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllInfoOrganizations(){
		JsonInfos jInfos = InfoToJsonConverter.convertEntityListToJsonList(infoService.findAll());
		return Response.ok(jInfos).build();
	}
}