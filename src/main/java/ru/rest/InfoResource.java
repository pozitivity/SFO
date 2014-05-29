package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.InfoDao;
import ru.domain.Info;
import ru.rest.model.JsonInfo;
import ru.rest.model.JsonInfos;
import ru.rest.model.converter.InfoToJsonConverter;


@Component
@Path("/info")
@Scope("request")
public class InfoResource{
	@Autowired
	private InfoDao infoDao;
	
	@POST
	@Path("/newInfo")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response newInfo(@FormParam("info") String info){
		Info sInfo = new Info();
		sInfo.setInfo(info);
		infoDao.save(sInfo);
		JsonInfo jInfo = InfoToJsonConverter.convertEntityToJson(sInfo);
		return Response.ok(jInfo).build();
	}
	
	@PUT
	@Path("/updateInfo")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response updateInfo(@FormParam("infoId") Long infoId,
			@FormParam("info") String info) {
		Info sInfo = infoDao.findOne(infoId);
		sInfo.setInfo(info);
		infoDao.save(sInfo);
		JsonInfo jInfo = InfoToJsonConverter.convertEntityToJson(sInfo);
		return Response.ok(jInfo).build();
	}
	
}