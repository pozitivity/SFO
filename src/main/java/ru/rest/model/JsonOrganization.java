package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;;


@XmlRootElement(name = "organization")
public class JsonOrganization {

	private Long organizationId;
	
	private String street;
	
	private JsonRubric rubric;
	
	private String postcode;
	
	private String website;
	
	private String phone;
	
	private JsonInfoOrganization info;
	
	private JsonLogo logo;
	
	private JsonUser user;
	
	public JsonOrganization(){
		
	}
	
	public JsonOrganization(Long organizationId, String street, String postcode, String website, String phone, 
			JsonRubric rubric, JsonInfoOrganization info, JsonLogo logo, JsonUser user){
		this.organizationId = organizationId;
		this.street = street;
		this.postcode = postcode;
		this.website  = website;
		this.phone = phone;
		this.rubric = rubric;
		this.info = info;
		this.logo = logo;
		this.user = user;
	}
	
	public Long getOrganizationId(){
		return organizationId;
	}
	
	public void setOrganizationId(Long organizationId){
		this.organizationId = organizationId;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getPostcode(){
		return postcode;
	}
	
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getWebsite(){
		return website;
	}
	
	public void setWebsite(String website){
		this.website = website;
	}
	
	public JsonRubric getRubric(){
		return rubric;
	}
	
	public void setRubric(JsonRubric rubric){
		this.rubric = rubric;
	}
	
	public JsonInfoOrganization getInfo(){
		return info;
	}
	
	public void setInfo(JsonInfoOrganization info){
		this.info = info;
	}
	
	public JsonLogo getLogo(){
		return logo;
	}
	
	public void setLogo(JsonLogo logo){
		this.logo = logo;
	}
	
	public JsonUser getUser(){
		return user;
	}
	
	public void setUser(JsonUser user){
		this.user = user;
	}
	
}

