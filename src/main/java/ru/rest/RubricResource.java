package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonRubrics;
import ru.rest.model.converter.RubricToJsonConverter;
import ru.service.RubricService;


@Component
@Path("/rubricService")
public class RubricResource{
	@Autowired
	private RubricService rubricService;
	
	@GET
	@Path("rubric")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllRubrics(){
		JsonRubrics jRubrics = RubricToJsonConverter.convertEntityListToJsonList(rubricService.findAll());
		return Response.ok(jRubrics).build();
	}
}