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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

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
	
	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response saveLogo(@FormDataParam("logo") InputStream logoInputStream,
			@FormDataParam("logo") FormDataContentDisposition contentDispositionHeader) throws IOException{
		byte[] bLogo = new byte[8192];
		try{
			logoInputStream.read(bLogo);
			logoInputStream.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Logo logo = new Logo();
		//logo.setLogoId(logo.getLogoId());
		logo.setLogo(bLogo);
		logo.setLogoId(logo.getLogoId());
		logo.setLogoName(contentDispositionHeader.getFileName());
		logoService.save(logo);
		return Response.status(200).entity(logo).build();
	}
}
