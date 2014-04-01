package ru.rest.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "logos")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonLogos {
	
	@XmlElement(name = "logo")
	private List<JsonLogo> logos = new ArrayList<JsonLogo>();
	
	public JsonLogos(){
		
	}
	
	public JsonLogos(List<JsonLogo> logos){
		this.logos = logos;
	}
	
	public List<JsonLogo> getLogos(){
		return logos;
	}
	
	public void setLogos(List<JsonLogo> logos){
		this.logos = logos;
	}
	
	public void add(JsonLogo logo){
		this.logos.add(logo);
	}

}
