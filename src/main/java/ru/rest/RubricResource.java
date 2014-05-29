package ru.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.RubricDao;
import ru.domain.Rubric;
import ru.rest.model.JsonRubric;
import ru.rest.model.JsonRubrics;
import ru.rest.model.converter.RubricToJsonConverter;


@Component
@Path("/rubric")
@Scope("request")
public class RubricResource{
	@Autowired
	private RubricDao rubricService;
	
	@GET
	@Path("rubrics")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getMainRubrics(@QueryParam("mainRubricId") Long mainRubricId){
		JsonRubrics jRubrics = RubricToJsonConverter.convertEntityListToJsonList(rubricService.findByMainRubricId(mainRubricId));
		return Response.ok(jRubrics).build();
	}
	
	@GET
	@Path("mainRubric")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getMainRubrci(@QueryParam("mainRubricId") Long mainRubricId) {
		Rubric sRubric = rubricService.findOne(mainRubricId);
		JsonRubric jRubric = RubricToJsonConverter.convertEntityToJson(sRubric);
		return Response.ok(jRubric).build();
	}
	
	@GET
	@Path("rubricsall")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getMainRubrics(){
		JsonRubrics jRubrics = RubricToJsonConverter.convertEntityListToJsonList(rubricService.findAll());
		return Response.ok(jRubrics).build();
	}
}