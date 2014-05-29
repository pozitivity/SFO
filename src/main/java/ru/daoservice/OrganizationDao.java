package ru.daoservice;

import java.util.List;

import ru.domain.City;
import ru.domain.Info;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;

public interface OrganizationDao {
	public Organization findOne(Long organizationId);
	public List<Organization> findAll();
	public List<Organization> findByUserAndLogoAndRubricAndInfo(User user, Logo logo, Rubric rubric, Info info);
	public List<Organization> findByRubricAndCityAndPublished(Rubric rubric, City city, boolean published);
	public List<Organization> findByUser(User user);
	public List<Organization> findByPublished(boolean published);
	
	public void delete(Organization organization);
	public void save(Organization organization);
}
