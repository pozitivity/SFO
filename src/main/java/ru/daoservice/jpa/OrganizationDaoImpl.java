package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import ru.daoservice.OrganizationDao;
import ru.domain.Info;
import ru.domain.Logo;
import ru.domain.Organization;
import ru.domain.Rubric;
import ru.domain.User;
import ru.repository.OrganizationRepository;

@Service("organizationService")
@Repository
@Transactional
public class OrganizationDaoImpl implements OrganizationDao{

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
			Info info){
		return organizationRepository.findByUserAndLogoAndRubricAndInfoOrganization(user, logo, rubric, info);
	}

	@Override
	public Organization save(Organization organization) {
		return organizationRepository.save(organization);
	}

	@Override
	public List<Organization> findByRubric(Rubric rubric) {
		return (List<Organization>)organizationRepository.findByRubric(rubric);
	}
}
