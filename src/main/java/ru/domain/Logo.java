package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "logo")
public class Logo implements Serializable{
	@Id
	@Column(name = "logo_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@OneToMany(mappedBy = "logo", fetch = FetchType.EAGER)
	private Long logoId;
	
	@Column(name = "logo")
	private String logo;
	
	@OneToOne(optional = false, mappedBy = "logo", fetch = FetchType.EAGER, 
	cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private Organization contacts;
	
	public Logo(){
		
	}
	
	public Logo(Long logoId, String logo){
		this.logoId = logoId;
		this.logo = logo;
	}
	
	public long getLogoId(){
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
	
	public Organization getContacts(){
		return contacts;
	}
	
	public void setContacts(Organization contacts){
		this.contacts = contacts;
	}
}
