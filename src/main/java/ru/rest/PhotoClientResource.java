package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonPhotoClients;
import ru.rest.model.converter.PhotoClientToJsonConverter;
import ru.service.PhotoClientService;


@Component
@Path("/photoService")
public class PhotoClientResource{
	@Autowired
	private PhotoClientService photoClientService;
	
	@GET
	@Path("photos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllPhotoClients(){
		JsonPhotoClients jPhotoClients = PhotoClientToJsonConverter.convertEntityListToJsonList(photoClientService.findAll());
		return Response.ok(jPhotoClients).build();
	}
}
