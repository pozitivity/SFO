package ru.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.City;
import ru.domain.Info;
import ru.domain.User;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;

public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long>{
	public List<Organization> findByUserAndLogoAndRubricAndInfo(User user, Logo logo, Rubric rubric, Info info);
	public List<Organization> findByRubricAndCityAndPublished(Rubric rubric, City city, boolean published);
	public List<Organization> findByUser(User user);
	public List<Organization> findByPublished(boolean published);
}
