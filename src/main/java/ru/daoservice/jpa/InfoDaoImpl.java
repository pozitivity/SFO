package ru.daoservice.jpa;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ru.daoservice.InfoDao;
import ru.domain.Info;
import ru.repository.InfoRepository;

@Service("infoDaoService")
@Repository
@Transactional
public class InfoDaoImpl implements InfoDao{

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