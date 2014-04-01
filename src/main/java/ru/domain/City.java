package ru.domain;

import java.io.Serializable;

//import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToMany; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "city")
public class City implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "city_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
	private Long cityId;
	
	@Column(name = "city_name")
	private String cityName;
	
	public City(){
		
	}
	
	public City(Long cityId, String cityName){
		this.cityId = cityId;
		this.cityName = cityName;
	}
	
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
