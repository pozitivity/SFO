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




import ru.daoservice.InfoDao;
import ru.rest.model.JsonInfos;
import ru.rest.model.converter.InfoToJsonConverter;


@Component
@Path("/infoService")
@Scope("request")
public class InfoResource{
	@Autowired
	private InfoDao infoService;
	
	@GET
	@Path("infos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllInfoOrganizations(){
		JsonInfos jInfos = InfoToJsonConverter.convertEntityListToJsonList(infoService.findAll());
		return Response.ok(jInfos).build();
	}
}