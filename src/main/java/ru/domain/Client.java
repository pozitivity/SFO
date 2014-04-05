package ru.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientId;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@OneToOne
	//@JoinColumn(name = "photo_id")
	@PrimaryKeyJoinColumn
	private Photo photo;
	
	public Client(){
		
	}
	
	public Client(Long clientId, User user, String firstname, String lastname, Photo photo){
		this.clientId = clientId;
		this.user = user;
		this.firstname = firstname;
		this.lastname = lastname;
		this.photo = photo;
	}
	
	public Long getClientId(){
		return clientId;
	}
	
	public void setClientId(Long clientId){
		this.clientId = clientId;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	public String getFirstname(){
		return firstname;
	}
	
	public void setFirstname(String firstname){
		this.firstname = firstname;
	}
	public String getLastname(){
		return lastname;
	}
	
	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
}
