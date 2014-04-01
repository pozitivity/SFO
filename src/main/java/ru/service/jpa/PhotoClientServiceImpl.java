package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.PhotoClient;
import ru.repository.PhotoClientRepository;
import ru.service.PhotoClientService;

@Service("photoclientService")
@Repository
@Transactional
public class PhotoClientServiceImpl implements PhotoClientService{
	@Autowired
	private PhotoClientRepository photoRepository;
	
	@Transactional(readOnly = true)
	public PhotoClient findOne(Long photoId){
		return photoRepository.findOne(photoId);
	}
	
	@Transactional(readOnly = true)
	public List<PhotoClient> findAll(){
		return (List<PhotoClient>)photoRepository.findAll();
	}
}
