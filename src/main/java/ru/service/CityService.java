package ru.service;

import java.util.List;

import ru.domain.City;

public interface CityService {
	public City findOne(Long cityId);
	public List<City> findAll();
	public City save(City city);
	public void delete(City city);
	public City update(City city);
}
