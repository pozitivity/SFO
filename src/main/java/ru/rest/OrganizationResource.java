package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonOrganizations;
import ru.rest.model.converter.OrganizationToJsonConverter;
import ru.service.OrganizationService;


@Component
@Path("/organizationService")
public class OrganizationResource{
	@Autowired
	private OrganizationService organizationService;
	
	@GET
	@Path("organizations")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllOrganizations(){
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationService.findAll());
		return Response.ok(jOrganizations).build();
	}
}
