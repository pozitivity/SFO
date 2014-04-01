package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "info_organization")
public class InfoOrganization implements Serializable {
	@Id
	@Column(name = "info_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "info_organization", fetch = FetchType.EAGER)
	private Long infoId;
	
	@Column(name = "info")
	private String info;
	
	@OneToOne(optional = false, mappedBy = "info", fetch = FetchType.EAGER, 
			cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private Organization organization;
	
	public InfoOrganization() {
		
	}
	
	public InfoOrganization(Long infoId, String info, Organization organization){
		this.infoId = infoId;
		this.info = info;
		this.organization = organization;
	}
	
	public Long getInfoId(){
		return infoId;
	}
	
	public void setInfoId(long infoId){
		this.infoId = infoId;
	}
	
	public String getInfo(){
		return info;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
}

