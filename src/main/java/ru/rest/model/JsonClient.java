package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import ru.domain.PhotoClient;

@XmlRootElement(name = "client")
public class JsonClient {

	private Long clientId;
	
	private JsonUser user;
	
	private String firstName;
	
	private String lastName;
	
	private JsonPhotoClient photo;
	
	public Long getClientId(){
		return clientId;
	}
	
	public void setClientId(Long clientId){
		this.clientId = clientId;
	}
	
	public JsonUser getUser(){
		return user;
	}
	
	public void setUser(JsonUser user){
		this.user = user;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public JsonPhotoClient getPhoto(){
		return photo;
	}
	
	public void setPhoto(JsonPhotoClient photo){
		this.photo = photo;
	}
}
