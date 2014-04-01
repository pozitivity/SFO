package ru.rest.model;

import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cities")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonCities {

	@XmlElement(name = "city")
	private List<JsonCity> cities = new ArrayList<JsonCity>();
	
	public JsonCities(){
		
	}
	public JsonCities(List<JsonCity> cities){
		this.cities = cities;
	}
	
	public List<JsonCity> getCities(){
		return cities;
	}
	
	public void setCities(List<JsonCity> cities){
		this.cities = cities;
	}
	
	public void add(JsonCity city){
		this.cities.add(city);
	}
}
