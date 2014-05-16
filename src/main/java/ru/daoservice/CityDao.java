package ru.daoservice;

import java.util.List;

import ru.domain.City;

public interface CityDao {
	public City findOne(Long cityId);
	public List<City> findAll();
	public City save(City city);
	public void delete(City city);
	public City update(City city);
	public City findByCityName(String cityName);
}
