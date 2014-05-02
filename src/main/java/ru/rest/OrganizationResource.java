package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.domain.Organization;
import ru.domain.Rubric;
import ru.rest.model.JsonOrganizations;
import ru.rest.model.converter.OrganizationToJsonConverter;
import ru.service.OrganizationService;
import ru.service.RubricService;


@Component
@Path("/organizationService")
public class OrganizationResource{
	@Autowired
	private OrganizationService organizationService;
	
	@Autowired
	private RubricService rubricService;
	
	/*@GET
	@Path("organizations")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllOrganizations(){
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationService.findAll());
		return Response.ok(jOrganizations).build();
	}*/
	
	@GET
	@Path("/organizations")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getOrganizationsByRubric(@QueryParam("rubricId") Long rubricId) {
		Rubric rubric = rubricService.findOne(rubricId);
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationService.findByRubric(rubric));
		return Response.ok(jOrganizations).build();
	}
}
