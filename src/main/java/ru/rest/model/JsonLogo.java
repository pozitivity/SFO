package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "logo")
public class JsonLogo {

	private Long logoId;
	
	private String logo;
	
	public Long getLogoId(){
		return logoId;
	}
	
	public void setLogoId(Long logoId){
		this.logoId = logoId;
	}
	
	public String getLogo(){
		return logo;
	}
	
	public void setLogo(String logo){
		this.logo = logo;
	}
}
