package ru.service.jpa;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ru.domain.Info;
import ru.repository.InfoRepository;
import ru.service.InfoService;

@Service("infoService")
@Repository
@Transactional
public class InfoServiceImpl implements InfoService{

	@Autowired
	private InfoRepository infoRepository;
	
	@Transactional(readOnly = true)
	public Info findOne(Long infoId){
		return infoRepository.findOne(infoId);
	}
	
	@Transactional(readOnly = true)
	public List<Info> findAll(){
		return (List<Info>)infoRepository.findAll();
	}
}