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
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client implements Serializable{
	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
	private Long clientId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@OneToOne
	@JoinColumn(name = "photo_id")
	private PhotoClient photoClient;
	
	public Client(){
		
	}
	
	public Client(Long clientId, User user, String firstname, String lastname, PhotoClient photoClient){
		this.clientId = clientId;
		this.user = user;
		this.firstname = firstname;
		this.lastname = lastname;
		this.photoClient = photoClient;
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

	public PhotoClient getPhotoClient() {
		return photoClient;
	}

	public void setPhotoClient(PhotoClient photoClient) {
		this.photoClient = photoClient;
	}

}
