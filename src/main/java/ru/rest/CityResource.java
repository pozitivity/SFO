package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonCities;
import ru.rest.model.converter.CityToJsonConverter;
import ru.service.CityService;


@Component
@Path("/cityService")
public class CityResource{
	@Autowired
	private CityService cityService;
	
	@GET
	@Path("city")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllCities(){
		JsonCities jCities = CityToJsonConverter.convertEntityListToJsonList(cityService.findAll());
		return Response.ok(jCities).build();
	}
}