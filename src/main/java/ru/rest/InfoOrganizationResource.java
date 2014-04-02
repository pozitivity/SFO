package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonInfoOrganizations;
import ru.rest.model.converter.InfoOrganizationToJsonConverter;
import ru.service.InfoOrganizationService;


@Component
@Path("/infoService")
public class InfoOrganizationResource{
	@Autowired
	private InfoOrganizationService infoOrganizationService;
	
	@GET
	@Path("infos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllInfoOrganizations(){
		JsonInfoOrganizations jInfoOrganizations = InfoOrganizationToJsonConverter.convertEntityListToJsonList(infoOrganizationService.findAll());
		return Response.ok(jInfoOrganizations).build();
	}
}
