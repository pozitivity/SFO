package ru.repository;

import ru.domain.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<City, Long>{
	public City findByCityName(String cityName);
}
