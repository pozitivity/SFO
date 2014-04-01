package ru.service.jpa;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ru.domain.InfoOrganization;
import ru.repository.InfoOrganizationRepository;
import ru.service.InfoOrganizationService;

@Service("infoService")
@Repository
@Transactional
public class InfoOrganizationServiceImpl implements InfoOrganizationService{

	@Autowired
	private InfoOrganizationRepository infoRepository;
	
	@Transactional(readOnly = true)
	public InfoOrganization findOne(Long infoId){
		return infoRepository.findOne(infoId);
	}
	
	@Transactional(readOnly = true)
	public List<InfoOrganization> findAll(){
		return (List<InfoOrganization>)infoRepository.findAll();
	}
}
