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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.domain.City;
import ru.rest.model.JsonCities;
import ru.rest.model.JsonCity;
import ru.rest.model.JsonLogo;
import ru.rest.model.converter.CityToJsonConverter;
import ru.rest.model.converter.LogoToJsonConverter;
import ru.service.CityService;

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
	
	@GET
	@Path("/city")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response findById(@QueryParam("cityId") Long cityId){
		JsonCity Id = CityToJsonConverter.convertEntityToJson(cityService.findOne(cityId));
		if(Id != null){
			return Response.status(200).entity(Id).build();
		}else{
			return Response.status(404).entity("The city with the id " + cityId + "does not exist").build();
		}
	}
	
	@GET
	@Path("/newCity")
	@Produces({MediaType.APPLICATION_JSON + ";chraset=utf-8"})
	@Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response saveCity(@QueryParam("cityName") String cityName){
		City sCity = new City();
		sCity.setCityName(cityName);
		if(sCity != null){
			JsonCity jCity = CityToJsonConverter.convertEntityToJson(cityService.save(sCity));
			return Response.status(200).entity(jCity).build();
		} else
			return Response.status(404).entity("Failure creation new city").build();
	}
	
	@GET
	@Path("/deleteCity")
	@Produces({MediaType.APPLICATION_JSON + ";chraset=utf-8"})
	@Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response deleteCity(@QueryParam("cityId") Long cityId){
		City sCity = new City();
		sCity.setCityId(cityId);
		if(sCity != null){
			JsonCity jCity = CityToJsonConverter.convertEntityToJson(sCity);
			cityService.delete(sCity);
			return Response.status(200).entity(jCity).build();
		}else{
			return Response.status(404).entity("Failure delete city").build();
		}
	}
	
	@GET
	@Path("/updateCity")
	@Produces({MediaType.APPLICATION_JSON + ";chraset=utf-8"})
	@Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response updateCity(@QueryParam("cityId") Long cityId, @QueryParam("cityName") String cityName){
		City sCity = new City();
		sCity.setCityName(cityName);
		sCity.setCityId(cityId);
		if(sCity != null){
			JsonCity jCity = CityToJsonConverter.convertEntityToJson(cityService.save(sCity));
			return Response.status(200).entity(jCity).build();
		} else
			return Response.status(404).entity("Failure update city").build();
	}
	
}