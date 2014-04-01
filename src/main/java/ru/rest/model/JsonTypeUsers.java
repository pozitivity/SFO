package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "type_users")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonTypeUsers {

	@XmlElement(name = "type_user")
	private List<JsonTypeUser> typeUsers = new ArrayList<JsonTypeUser>();
	
	public JsonTypeUsers(){
		
	}
	
	public JsonTypeUsers(List<JsonTypeUser> typeUsers){
		this.typeUsers = typeUsers;
	}
	
	public List<JsonTypeUser> getTypeUsers(){
		return typeUsers;
	}
	
	public void setTypeUsers(List<JsonTypeUser> typeUsers){
		this.typeUsers = typeUsers;
	}
	
	public void add(JsonTypeUser typeUser){
		this.typeUsers.add(typeUser);
	}
}
