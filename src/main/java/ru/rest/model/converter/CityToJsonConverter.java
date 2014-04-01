package ru.rest.model.converter;

import java.util.List;

import ru.domain.City;
import ru.rest.model.JsonCities;
import ru.rest.model.JsonCity;

public class CityToJsonConverter {

	public static JsonCity convertEntityToJson(City sCity){
		JsonCity jCity = new JsonCity();
		jCity.setCityId(sCity.getCityId());
		jCity.setCityName(sCity.getCityName());
		
		return jCity;
	}
	
	public static City convertJsonToEntity(JsonCity jCity, City sCity){
		sCity.setCityId(jCity.getCityId());
		sCity.setCityName(jCity.getCityName());
		
		return sCity;
	}
	
	public static City convertJsonToEntity(JsonCity jCity){
		return convertJsonToEntity(jCity, new City());
	}
	
	public static JsonCities convertEntityListToJsonList(List<City> sCities){
		JsonCities jCities = new JsonCities();
		for(City sCity:sCities){
			jCities.add(convertEntityToJson(sCity));;
		}
		return jCities;
	}

}
