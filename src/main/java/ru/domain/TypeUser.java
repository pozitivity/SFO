package ru.domain;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

@Entity
@Table(name = "type_user")
public class TypeUser implements Serializable{

	@Id
	@Column(name = "type_user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "type_users", fetch = FetchType.EAGER)
	private Long typeUserId;
	
	@Column(name = "type_user")
	private String typeUser;
	
	public TypeUser(){
		
	}
	
	public TypeUser(Long typeUserId, String typeUser){
		this.typeUserId = typeUserId;
		this.typeUser = typeUser;
		
	}
	
	public Long getTypeUserId(){
		return typeUserId;
	}
	
	public void setTypeUserId(Long id){
		this.typeUserId = id;
	}
	
	public String getTypeUser(){
		return typeUser;
	}
	
	public void setTypeUser(String typeUser){
		this.typeUser = typeUser;
	}
}


