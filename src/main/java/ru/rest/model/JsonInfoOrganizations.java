package ru.rest.model;

import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "info_organizations")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonInfoOrganizations {
	@XmlElement(name = "info_organization")
	private List<JsonInfoOrganization> infoOrganizations = new ArrayList<JsonInfoOrganization>();
	
	public JsonInfoOrganizations(){
		
	}
	
	public JsonInfoOrganizations(List<JsonInfoOrganization> infoOrganizations){
		this.infoOrganizations = infoOrganizations;
	}
	
	public List<JsonInfoOrganization> getInfoOrganizations(){
		return infoOrganizations;
	}
	
	public void setInfoOrganizations(List<JsonInfoOrganization> infoOrganizations){
		this.infoOrganizations = infoOrganizations;
	}
	
	public void add(JsonInfoOrganization infoOrganization){
		this.infoOrganizations.add(infoOrganization);
	}

}
