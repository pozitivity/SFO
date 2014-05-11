package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.PhotoDao;
import ru.rest.model.JsonPhotos;
import ru.rest.model.converter.PhotoToJsonConverter;


@Component
@Path("/photoService")
@Scope("request")
public class PhotoResource{
	@Autowired
	private PhotoDao photoService;
	
	@GET
	@Path("photos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllPhotos(){
		JsonPhotos jPhotos = PhotoToJsonConverter.convertEntityListToJsonList(photoService.findAll());
		return Response.ok(jPhotos).build();
	}
}
