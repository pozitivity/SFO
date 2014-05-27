package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.CityDao;
import ru.daoservice.TypeUserDao;
import ru.daoservice.UserDao;
import ru.domain.City;
import ru.domain.TypeUser;
import ru.domain.User;
import ru.rest.model.JsonUser;
import ru.rest.model.JsonUsers;
import ru.rest.model.converter.UserToJsonConverter;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;


@Component
@Path("/user")
@Scope("request")
public class UserResource{
	@Autowired
	private UserDao userService;
	@Autowired
	private CityDao cityDao;
	@Autowired
	private TypeUserDao typeUserDao;
	/*@Autowired
	private MailSender mailSender;*/
	
	@GET
	@Path("users")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getAllUsers(){
		JsonUsers jUsers = UserToJsonConverter.convertEntityListToJsonList(userService.findAll());
		return Response.ok(jUsers).build();
	}
	
	@GET
	@Path("byLogin")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getUserByLogin(@QueryParam("login") String login){
		JsonUser jUser = UserToJsonConverter.convertEntityToJson(userService.findByLogin(login));
		return Response.ok(jUser).build();
	}
	
	@POST
	@Path("registration")
	//@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
	//@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response newUsers(@FormParam("login") String login,
			@FormParam("password") String password, 
			@FormParam("cityName") String cityName,
			@FormParam("email") String email){
		User sUser = new User();
		sUser.setLogin(login);
		sUser.setPassword(password);
		City sCity = cityDao.findByCityName(cityName);
		sUser.setCity(sCity);
		sUser.setEmail(email);
		Number id = 2;
		Long typeUserId = id.longValue();
		TypeUser sTypeUser = typeUserDao.findOne(typeUserId);
		sUser.setTypeUser(sTypeUser);
		userService.save(sUser);
        
		return Response.status(Status.CREATED).build();
	}
}