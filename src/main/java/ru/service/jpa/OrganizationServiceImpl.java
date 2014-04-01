package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import ru.domain.InfoOrganization;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;
import ru.repository.OrganizationRepository;
import ru.service.OrganizationService;

@Service("organizationService")
@Repository
@Transactional
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Transactional(readOnly = true)
	public Organization findOne(Long organizationId){
		return organizationRepository.findOne(organizationId);
	}
	
	@Transactional(readOnly = true)
	public List<Organization> findAll(){
		return (List<Organization>)organizationRepository.findAll();
	}
	
	@Override
	public List<Organization> findByUserAndLogoAndRubricAndInfoOrganization(User user,Logo logo, Rubric rubric,
			InfoOrganization infoOrganization){
		return organizationRepository.findByUserAndLogoAndRubricAndInfoOrganization(user, logo, rubric, infoOrganization);
	}
}
