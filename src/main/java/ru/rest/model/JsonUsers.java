package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonUsers {
	@XmlElement(name = "user")
	private List<JsonUser> users = new ArrayList<JsonUser>();
	
	public JsonUsers(){
		
	}
	
	public JsonUsers(List<JsonUser> users){
		this.users = users;
	}
	
	public List<JsonUser> getUsers(){
		return users;
	}
	
	public void setUsers(List<JsonUser> users){
		this.users = users;
	}
	
	public void add(JsonUser user){
		this.users.add(user);
	}

}
