package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.CityDao;
import ru.daoservice.InfoDao;
import ru.daoservice.LogoDao;
import ru.daoservice.OrganizationDao;
import ru.daoservice.RubricDao;
import ru.daoservice.UserDao;
import ru.domain.City;
import ru.domain.Info;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;
import ru.rest.model.JsonOrganizations;
import ru.rest.model.converter.OrganizationToJsonConverter;


@Component
@Path("/organization")
@Scope("request")
public class OrganizationResource{
	@Autowired
	private OrganizationDao organizationDao;
	
	@Autowired
	private RubricDao rubricDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private LogoDao logoDao;
	
	@Autowired 
	private InfoDao infoDao;
	
	@GET
	@Path("/byCityAndByRubric")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getOrganizationsByRubric(@QueryParam("rubricId") Long rubricId,
			@QueryParam("cityId") Long cityId) {
		Rubric rubric = rubricDao.findOne(rubricId);
		City city = cityDao.findOne(cityId);
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationDao.findByRubricAndCity(rubric, city));
		return Response.ok(jOrganizations).build();
	}
	
	@GET
	@Path("/byUser")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getOrganizationsByUser(@QueryParam("userId") Long userId){
		User user = userDao.findOne(userId);
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationDao.findByUser(user));
		return Response.ok(jOrganizations).build();
	}
	
	@POST
	@Path("/newOrganization")
	public Response newOrganizations(@FormParam("rubricId") Long rubricId,
			@FormParam("address") String address,
			@FormParam("website") String website,
			@FormParam("postcode") String postcode,
			@FormParam("name") String name,
			@FormParam("phone") String phone,
			@FormParam("cityId") Long cityId,
			@FormParam("infoId") Long infoId,
			@FormParam("logoId") Long logoId,
			@FormParam("userId") Long userId) {
		Organization sOrganization = new Organization();
		sOrganization.setAddress(address);
		sOrganization.setName(name);
		sOrganization.setPhone(phone);
		sOrganization.setPostcode(postcode);
		sOrganization.setWebsite(website);
		
		Rubric sRubric = rubricDao.findOne(rubricId);
		City sCity = cityDao.findOne(cityId);
		Logo sLogo = logoDao.findOne(logoId);
		Info sInfo = infoDao.findOne(infoId);
		User sUser = userDao.findOne(userId);
		
		sOrganization.setCity(sCity);
		sOrganization.setInfo(sInfo);
		sOrganization.setLogo(sLogo);
		sOrganization.setRubric(sRubric);
		sOrganization.setUser(sUser);
		
		organizationDao.save(sOrganization);
		
		return Response.status(Status.CREATED).build();
	}
}
