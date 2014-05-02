package ru.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import ru.domain.Rubric;
import ru.domain.Info;
import ru.domain.Logo;

@Entity
@Table(name = "organization")
public class Organization implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "organization_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long organizationId;
	
	@Column(name = "address")
	private String address;
	
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
	private Info info;
	
	@OneToOne
	@JoinColumn(name = "logo_id")
	private Logo logo;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name="name")
	private String name;
	
	public Organization() {
		
	}
	
	public Organization(Long organizationId, String address, Rubric rubric, String postcode, String website, 
			String phone, Info info, Logo logo, User user,String name){
		this.organizationId = organizationId;
		this.address = address;
		this.rubric = rubric;
		this.postcode = postcode;
		this.website = website;
		this.phone = phone;
		this.info = info;
		this.logo = logo;
		this.user = user;
		this.name = name;
	}
	
	public Long getOrganizationId(){
		return organizationId;
	}
	
	public void setOrganizationId(Long organizationId){
		this.organizationId = organizationId;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
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
	
	public Info getInfo(){
		return info;
	}
	
	public void setInfo(Info info){
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
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
