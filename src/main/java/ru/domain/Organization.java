package ru.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import ru.domain.Rubric;
import ru.domain.InfoOrganization;
import ru.domain.Logo;

@Entity
@Table(name = "organization")
public class Organization implements Serializable{
	@Id
	@Column(name = "organization_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "organization", fetch = FetchType.EAGER)
	private Long organizationId;
	
	@Column(name = "street")
	private String street;
	
	@ManyToOne
	@JoinColumn(name = "rubric_id")
	private Rubric rubric;
	
	@Column(name = "postcode")
	private String postcode;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phone")
	private String phone;
	
	@OneToOne
	@JoinColumn(name = "info_id")
	private InfoOrganization info;
	
	@ManyToOne
	@JoinColumn(name = "logo_id")
	private Logo logo;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Organization() {
		
	}
	
	public Organization(Long organizationId, String street, Rubric rubric, String postcode, String website, 
			String phone, InfoOrganization info, Logo logo, User user){
		this.organizationId = organizationId;
		this.street = street;
		this.rubric = rubric;
		this.postcode = postcode;
		this.website = website;
		this.phone = phone;
		this.info = info;
		this.logo = logo;
		this.user = user;
	}
	
	public Long getOrganizationId(){
		return organizationId;
	}
	
	public void setOrganizationId(Long organizationId){
		this.organizationId = organizationId;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}

	public Rubric getRubric(){
		return rubric;
	}
	
	public void setRubric(Rubric rubric){
		this.rubric = rubric;
	}
	
	public String getPostcode(){
		return postcode;
	}
	
	public void setPostcode(String postcode){
		this.postcode = postcode;
	}
	
	public String getWebsite(){
		return website;
	}
	
	public void setWebsite(String website){
		this.website = website;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public InfoOrganization getInfo(){
		return info;
	}
	
	public void setInfo(InfoOrganization info){
		this.info = info;
	}
	
	public Logo getLogo(){
		return logo;
	}
	
	public void setLogo(Logo logo){
		this.logo = logo;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
}
