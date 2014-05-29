package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
		boolean published = true;
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationDao.findByRubricAndCityAndPublished(rubric, city, published));
		return Response.ok(jOrganizations).build();
	}
	
	@GET
	@Path("/byPublished")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getOrganizationsByPublished(){
		boolean published = false;
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationDao.findByPublished(published));
		return Response.ok(jOrganizations).build();
	}
	
	@GET
	@Path("/changePublished")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response changePublished(@QueryParam("organizationId") Long organizationId){
		boolean published = true;
		Organization sOrganization = organizationDao.findOne(organizationId);
		sOrganization.setPublished(published);
		organizationDao.save(sOrganization);
		
		return Response.status(Status.OK).build();
	}
	
	@GET
	@Path("/updateOrganization")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response updateOrganization(@QueryParam("organizationId") Long organizationId,
			@QueryParam("rubricId") Long rubricId,
			@QueryParam("address") String address,
			@QueryParam("infoId") Long infoId,
			@QueryParam("logoId") Long logoId,
			@QueryParam("cityId") Long cityId,
			@QueryParam("website") String website,
			@QueryParam("postcode") String postcode,
			@QueryParam("name") String name,
			@QueryParam("phone") String phone){
		Organization sOrganization = organizationDao.findOne(organizationId);
		
		City sCity = cityDao.findOne(cityId);
		Rubric sRubric = rubricDao.findOne(rubricId);
		Logo sLogo = logoDao.findOne(logoId);
		Info sInfo = infoDao.findOne(infoId);
		
		sOrganization.setAddress(address);
		sOrganization.setCity(sCity);
		sOrganization.setAddress(address);
		sOrganization.setRubric(sRubric);
		sOrganization.setInfo(sInfo);
		sOrganization.setLogo(sLogo);
		sOrganization.setWebsite(website);
		sOrganization.setPostcode(postcode);
		sOrganization.setPhone(phone);
		sOrganization.setName(name);
		
		organizationDao.save(sOrganization);
		
		return Response.status(Status.CREATED).build();
		
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
	
	@DELETE
	@Path("/deleteOrganization")
	public Response deleteOrganizationsById(@FormParam("organizationId") Long organizationId) {
		Organization organization =  organizationDao.findOne(organizationId);
		organizationDao.delete(organization);
		return Response.status(Status.NO_CONTENT).build();
	}
}
