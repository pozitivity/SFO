package ru.rest.model.converter;

import java.util.List;

import ru.domain.InfoOrganization;
import ru.rest.model.JsonInfoOrganization;
import ru.rest.model.JsonInfoOrganizations;



public class InfoOrganizationToJsonConverter {

	public static JsonInfoOrganization convertEntityToJson(InfoOrganization sInfoOrganization) {
		JsonInfoOrganization jInfoOrganization = new JsonInfoOrganization();
		jInfoOrganization.setInfoId(sInfoOrganization.getInfoId());
		jInfoOrganization.setInfo(sInfoOrganization.getInfo());
		
		return jInfoOrganization;
	}
	
	public static InfoOrganization convertJsonToEntity(JsonInfoOrganization jInfoOrganization, InfoOrganization sInfoOrganization){
		sInfoOrganization.setInfoId(jInfoOrganization.getInfoId());
		sInfoOrganization.setInfo(jInfoOrganization.getInfo());
		return sInfoOrganization;
	}
	
	public static InfoOrganization convertJsonToEntity(JsonInfoOrganization jInfoOrganization){
		return convertJsonToEntity(jInfoOrganization, new InfoOrganization());
	}
	public static JsonInfoOrganizations convertEntityListToJsonList(List<InfoOrganization> sInfoOrganizations){
		JsonInfoOrganizations jInfoOrganizations= new JsonInfoOrganizations();
		for(InfoOrganization sInfoOrganization:sInfoOrganizations){
			jInfoOrganizations.add(convertEntityToJson(sInfoOrganization));
		}
		return jInfoOrganizations;
	}
}
