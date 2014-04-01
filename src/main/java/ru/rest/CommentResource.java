package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.rest.model.JsonComments;
import ru.rest.model.converter.CommentToJsonConverter;
import ru.service.CommentService;


@Component
@Path("/commentService")
public class CommentResource{
	@Autowired
	private CommentService commentService;
	
	@GET
	@Path("comment")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllComments(){
		JsonComments jComments = CommentToJsonConverter.convertEntityListToJsonList(commentService.findAll());
		return Response.ok(jComments).build();
	}
}