package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import ru.daoservice.CityDao;
import ru.domain.City;
import ru.rest.model.JsonCities;
import ru.rest.model.JsonCity;
import ru.rest.model.JsonLogo;
import ru.rest.model.converter.CityToJsonConverter;
import ru.rest.model.converter.LogoToJsonConverter;

@Component
@Scope("request")
@Path("/city")
public class CityResource{
	@Autowired
	private CityDao cityService;
	
	@GET
	@Path("/cities")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllCitiesInJson(){
		JsonCities jCities = CityToJsonConverter.convertEntityListToJsonList(cityService.findAll());
		return Response.ok(jCities).build();
	}
	
	@GET
	@Path("/city")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response findById(@QueryParam("cityId") Long cityId){
		JsonCity jCity = CityToJsonConverter.convertEntityToJson(cityService.findOne(cityId));
		if(jCity != null){
			return Response.ok(jCity).build();
		}else{
			return Response.status(Status.NO_CONTENT).build();
		}
	}
	
}