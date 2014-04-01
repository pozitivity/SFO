package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.Logo;
import ru.repository.LogoRepository;
import ru.service.LogoService;

@Service("logoService")
@Repository
@Transactional
public class LogoServiceImpl implements LogoService{
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
}
