package ru.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.City;
import ru.repository.CityRepository;
import ru.service.CityService;

import java.util.List;



@Service("cityService")
@Repository
@Transactional
public class CityServiceImpl implements CityService{

	@Autowired
	private CityRepository cityRepository;
	
	@Transactional(readOnly = true)
	public City findOne(Long cityId){
		return cityRepository.findOne(cityId);
	}
	
	@Transactional(readOnly = true)
	public List<City> findAll(){
		return (List<City>) cityRepository.findAll();
	}

	@Override
	public City save(City city) {
		return cityRepository.save(city);
	}

	@Override
	public void delete(City city ) {
		cityRepository.delete(city);
	}
}
