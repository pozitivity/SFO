package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "type_user")
public class JsonTypeUser {

	private Long typeUserId;
	
	private String typeUser;
	
	public Long getTypeUserId(){
		return typeUserId;
	}
	
	public void setTypeUserId(Long typeUserId){
		this.typeUserId = typeUserId;
	}
	
	public String getTypeUser(){
		return typeUser;
	}
	
	public void setTypeUser(String typeUser){
		this.typeUser = typeUser;
	}
}
