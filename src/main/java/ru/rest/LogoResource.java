package ru.rest;

import java.io.File;
import java.io.FileInputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.LogoDao;
import ru.domain.Logo;
import ru.rest.model.JsonLogo;
import ru.rest.model.JsonLogos;
import ru.rest.model.converter.LogoToJsonConverter;


@Component
@Path("/logo")
@Scope("request")
public class LogoResource{
	@Autowired
	private LogoDao logoService;
	
	@GET
	@Path("logos")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllLogos(){
		JsonLogos jLogos = LogoToJsonConverter.convertEntityListToJsonList(logoService.findAll());
		return Response.ok(jLogos).build();
	}
	
	@GET
	@Path("logo/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response findById(@PathParam("id") Long id){
		JsonLogo logoId = LogoToJsonConverter.convertEntityToJson(logoService.findOne(id));
		if(logoId != null){
			return Response.status(200).entity(logoId).build();
		}else{
			return Response.status(404).entity("The logo with the id " + id + "does not exist").build();
		}
	}
	
	@POST
	@Path("/saveLogo")
	@Consumes({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	@Produces({MediaType.TEXT_PLAIN})
	public Response saveLogo(){
		File file = new File("images\\logo_13.jpg");
		byte[] bFile = new byte[(int)file.length()];
		
		try{
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Logo logo = new Logo();
		logo.setLogoName("logo#13");
		logo.setLogo(bFile);
		
		logoService.save(logo);
		return Response.ok(logo).build();
	}
}
