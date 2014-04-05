package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.Photo;
import ru.repository.PhotoRepository;
import ru.service.PhotoService;

@Service("photoService")
@Repository
@Transactional
public class PhotoServiceImpl implements PhotoService{
	@Autowired
	private PhotoRepository photoRepository;
	
	@Transactional(readOnly = true)
	public Photo findOne(Long photoId){
		return photoRepository.findOne(photoId);
	}
	
	@Transactional(readOnly = true)
	public List<Photo> findAll(){
		return (List<Photo>)photoRepository.findAll();
	}
}
