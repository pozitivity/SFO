package ru.service;

import java.util.List;

import ru.domain.InfoOrganization;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;

public interface OrganizationService {
	public Organization findOne(Long organizationId);
	public List<Organization> findAll();
	public List<Organization> findByUserAndLogoAndRubricAndInfoOrganization(User user, Logo logo, Rubric rubric, InfoOrganization infoOrganization);
}
