package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.type.BlobType;

@XmlRootElement(name = "logo")
public class JsonLogo {

	private Long logoId;
	
	private String logoName;
	
	private byte[] logo;
	
	public Long getLogoId(){
		return logoId;
	}
	
	public void setLogoId(Long logoId){
		this.logoId = logoId;
	}

	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
}
