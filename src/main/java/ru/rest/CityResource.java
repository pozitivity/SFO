package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.domain.City;
import ru.rest.model.JsonCities;
import ru.rest.model.JsonCity;
import ru.rest.model.converter.CityToJsonConverter;
import ru.service.CityService;

import java.net.URLEncoder;

@Component
@Path("/cityService")
public class CityResource{
	@Autowired
	private CityService cityService;
	
	@GET
	@Path("/cities")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllCitiesInJson(){
		JsonCities jCities = CityToJsonConverter.convertEntityListToJsonList(cityService.findAll());
		return Response.ok(jCities).build();
	}
	
	@POST 
	@Path("/newCity")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response newCity(City sCity){
		JsonCity jCity = CityToJsonConverter.convertEntityToJson(sCity);
		String result = "City saved: " + jCity; 
		return Response.status(201).entity(result).build();
	}
}