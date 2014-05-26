package ru.rest;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;





import java.util.ArrayList;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import ru.daoservice.LogoDao;
import ru.domain.Logo;
import ru.rest.model.JsonLogo;
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
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response saveLogo(@FormDataParam("logo") InputStream logoInputStream,
			@FormDataParam("logo") FormDataContentDisposition contentDispositionHeader) throws IOException{
		//byte[] bLogo = new byte[1024];
		byte[] bLogo = IOUtils.toByteArray(logoInputStream);
		try{
			logoInputStream.read(bLogo);
			logoInputStream.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Logo sLogo = new Logo();
		sLogo.setLogo(bLogo);
		sLogo.setLogoName(contentDispositionHeader.getFileName());
		JsonLogo jLogo = LogoToJsonConverter.convertEntityToJson(logoService.save(sLogo));
		return Response.ok(jLogo).build();
	}
	
	@GET
	 @Path("/byId")
	 @Produces("image/png")
	 public Response imageBytes(@QueryParam("logoId") Long logoId) {
	  byte[] image = logoService.findOne(logoId).getLogo();
	  return Response.ok(image, "image/png").build();
	 }
}
