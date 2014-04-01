package ru.service;

import java.util.List;

import ru.domain.City;

public interface CityService {
	public City findOne(Long cityId);
	public List<City> findAll();
}
