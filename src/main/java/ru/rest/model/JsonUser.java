package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class JsonUser {

	private Long userId;
	
	private String login;
	
	private String password;
	
	private String email;
	
	private boolean blocked;
	
	private JsonCity city;
	
	private JsonTypeUser typeUser;
	
	public Long getUserId(){
		return userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public Boolean getBlocked(){
		return blocked;
	}
	
	public void setBlocked(Boolean blocked){
		this.blocked = blocked;
	}

	public JsonCity getCity() {
		return city;
	}

	public void setCity(JsonCity city) {
		this.city = city;
	}

	public JsonTypeUser getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(JsonTypeUser typeUser) {
		this.typeUser = typeUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

