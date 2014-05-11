package ru.daoservice;

import java.util.List;

import ru.domain.Info;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;

public interface OrganizationDao {
	public Organization findOne(Long organizationId);
	public List<Organization> findAll();
	public List<Organization> findByUserAndLogoAndRubricAndInfoOrganization(User user, Logo logo, Rubric rubric, Info info);
	public Organization save(Organization organization);
	public List<Organization> findByRubric(Rubric rubric);
}
