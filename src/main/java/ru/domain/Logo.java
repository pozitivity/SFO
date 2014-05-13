package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

@Entity
@Table(name = "logo")
public class Logo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "logo_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long logoId;
	
	@Column(name = "logo_name")
	private String logoName;
	
	@Lob
	@Column(name = "logo", columnDefinition = "mediumblob")
	private byte[] logo;
	
	@OneToOne(optional = true, mappedBy = "logo", fetch = FetchType.EAGER, 
	cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private Organization contacts;
	
	public Logo(){
		
	}
	
	public Logo(Long logoId, byte[] logo, String logoName){
		this.logoId = logoId;
		this.logo = logo;
		this.logoName = logoName;
	}
	
	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}
	
	public byte[] getLogo(){
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Long getLogoId(){
		return logoId;
	}
	
	public void setLogoId(Long logoId){
		this.logoId = logoId;
	}
	
	public Organization getContacts(){
		return contacts;
	}
	
	public void setContacts(Organization contacts){
		this.contacts = contacts;
	}
	
}
