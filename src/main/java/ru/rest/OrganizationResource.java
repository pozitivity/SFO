package ru.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.daoservice.CityDao;
import ru.daoservice.OrganizationDao;
import ru.daoservice.RubricDao;
import ru.daoservice.UserDao;
import ru.domain.City;
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
	private OrganizationDao organizationService;
	
	@Autowired
	private RubricDao rubricService;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CityDao cityDao;
	
	@GET
	@Path("/byCityAndByRubric")
	@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
	public Response getOrganizationsByRubric(@QueryParam("rubricId") Long rubricId,
			@QueryParam("cityId") Long cityId) {
		Rubric rubric = rubricService.findOne(rubricId);
		City city = cityDao.findOne(cityId);
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationService.findByRubricAndCity(rubric, city));
		return Response.ok(jOrganizations).build();
	}
	
	@GET
	@Path("/byUser")
	@Produces({MediaType.APPLICATION_JSON + ";charset=utf-8"})
	public Response getOrganizationsByUser(@QueryParam("userId") Long userId){
		User user = userDao.findOne(userId);
		JsonOrganizations jOrganizations = OrganizationToJsonConverter.convertEntityListToJsonList(organizationService.findByUser(user));
		return Response.ok(jOrganizations).build();
	}
}
