package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;;


@XmlRootElement(name = "organization")
public class JsonOrganization {

	private Long organizationId;
	
	private String address;
	
	private JsonRubric rubric;
	
	private String postcode;
	
	private String website;
	
	private String phone;
	
	private JsonInfo info;
	
	private JsonLogo logo;
	
	private JsonUser user;
	
	private String name;
	
	public JsonOrganization(){
		
	}
	
	public JsonOrganization(Long organizationId, String address, String postcode, String website, String phone, 
			JsonRubric rubric, JsonInfo info, JsonLogo logo, JsonUser user){
		this.organizationId = organizationId;
		this.address = address;
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
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
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
	
	public JsonInfo getInfo(){
		return info;
	}
	
	public void setInfo(JsonInfo info){
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

