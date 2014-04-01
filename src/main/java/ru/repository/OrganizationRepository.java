package ru.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.InfoOrganization;
import ru.domain.User;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;

public interface OrganizationRepository extends PagingAndSortingRepository<Organization, Long>{
	public List<Organization> findByUserAndLogoAndRubricAndInfoOrganization(User user, Logo logo, Rubric rubric, InfoOrganization infoOrganization);

}
