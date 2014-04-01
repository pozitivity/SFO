package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "organizations")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonOrganizations {

	@XmlElement(name = "organization")
	private List<JsonOrganization> organizations = new ArrayList<JsonOrganization>();
	
	public JsonOrganizations(){
		
	}
	
	public JsonOrganizations(List<JsonOrganization> organizations){
		this.organizations = organizations;
	}
	
	public List<JsonOrganization> getOrganizations(){
		return organizations;
	}
	
	public void setOrganizations(List<JsonOrganization> organizations){
		this.organizations = organizations;
	}
	
	public void add(JsonOrganization organization){
		this.organizations.add(organization);
	}
}
