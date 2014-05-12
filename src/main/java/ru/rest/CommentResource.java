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

import ru.daoservice.CommentDao;
import ru.rest.model.JsonComments;
import ru.rest.model.converter.CommentToJsonConverter;


@Component
@Path("/comment")
@Scope("request")
public class CommentResource{
	@Autowired
	private CommentDao commentService;
	
	@GET
	@Path("comments")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllComments(){
		JsonComments jComments = CommentToJsonConverter.convertEntityListToJsonList(commentService.findAll());
		return Response.ok(jComments).build();
	}
}