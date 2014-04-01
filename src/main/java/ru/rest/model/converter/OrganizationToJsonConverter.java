package ru.rest.model.converter;

import java.util.List;

import ru.domain.Organization;
import ru.rest.model.JsonOrganization;
import ru.rest.model.JsonOrganizations;



public class OrganizationToJsonConverter {

	public static JsonOrganization convertEntityToJson(Organization sOrganization){
		JsonOrganization jOrganization = new JsonOrganization();
		jOrganization.setOrganizationId(sOrganization.getOrganizationId());
		jOrganization.setInfo(sOrganization.getInfo() == null ? null : InfoOrganizationToJsonConverter.convertEntityToJson(sOrganization.getInfo()));
		jOrganization.setLogo(sOrganization.getLogo() == null ? null : LogoToJsonConverter.convertEntityToJson(sOrganization.getLogo()));
		jOrganization.setPhone(sOrganization.getPhone());
		jOrganization.setPostcode(sOrganization.getPostcode());
		jOrganization.setRubric(sOrganization.getRubric() == null ? null : RubricToJsonConverter.convertEntityToJson(sOrganization.getRubric()));
		jOrganization.setStreet(sOrganization.getStreet());
		jOrganization.setWebsite(sOrganization.getWebsite());
		jOrganization.setUser(sOrganization.getUser() == null ? null : UserToJsonConverter.convertEntityToJson(sOrganization.getUser()));
		
		return jOrganization;
	}
	
	public static Organization convertJsonToEntity(JsonOrganization jOrganization, Organization sOrganization){
		sOrganization.setOrganizationId(jOrganization.getOrganizationId());
		sOrganization.setInfo(jOrganization.getInfo() == null ? null : InfoOrganizationToJsonConverter.convertJsonToEntity(jOrganization.getInfo()));
		sOrganization.setLogo(jOrganization.getLogo() == null ? null : LogoToJsonConverter.convertJsonToEntity(jOrganization.getLogo()));
		sOrganization.setPhone(jOrganization.getPhone());
		sOrganization.setPostcode(jOrganization.getPostcode());
		sOrganization.setRubric(jOrganization.getRubric() == null ? null : RubricToJsonConverter.convertJsonToEntity(jOrganization.getRubric()));
		sOrganization.setStreet(jOrganization.getStreet());
		sOrganization.setWebsite(jOrganization.getWebsite());
		sOrganization.setUser(jOrganization.getUser() == null ? null : UserToJsonConverter.convertJsonToEntity(jOrganization.getUser()));
		
		return sOrganization;
	}
	
	public static Organization convertJsonToEntity(JsonOrganization jOrganization){
		return convertJsonToEntity(jOrganization, new Organization());
	}
	
	public static JsonOrganizations convertEntityListToJsonList(List<Organization> sOrganizations){
		JsonOrganizations jOrganizations = new JsonOrganizations();
		for(Organization sOrganization:sOrganizations){
			jOrganizations.add(convertEntityToJson(sOrganization));
		}
		return jOrganizations;
	}
	
}
