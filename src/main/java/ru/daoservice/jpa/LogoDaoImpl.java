package ru.daoservice.jpa;

import java.util.List;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.daoservice.LogoDao;
import ru.domain.Logo;
import ru.repository.LogoRepository;

@Service("logoService")
@Repository
@Transactional
public class LogoDaoImpl implements LogoDao{
	@Autowired
	private LogoRepository logoRepository;
	
	@Transactional(readOnly = true)
	public Logo findOne(Long logoId){
		return logoRepository.findOne(logoId);
	}
	
	@Transactional(readOnly = true)
	public List<Logo> findAll(){
		return (List<Logo>)logoRepository.findAll();
	}

	@Override
	public Logo save(Logo logo) {
		return logoRepository.save(logo);
	}
}
