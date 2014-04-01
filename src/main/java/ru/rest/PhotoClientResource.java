package ru.rest;

import javax.ws.rs.Consumes;
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
@Path("/photoClientService")
public class PhotoClientResource{
	@Autowired
	private PhotoClientService photoClientService;
	
	@GET
	@Path("photoClient")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllPhotoClients(){
		JsonPhotoClients jPhotoClients = PhotoClientToJsonConverter.convertEntityListToJsonList(photoClientService.findAll());
		return Response.ok(jPhotoClients).build();
	}
}
