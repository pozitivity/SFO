package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class JsonCity {

	private Long cityId;
	
	private String cityName;
	
	public Long getCityId(){
		return cityId;
	}
	
	public void setCityId(Long cityId){
		this.cityId = cityId;
	}
	
	public String getCityName(){
		return cityName;
	}
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
}
