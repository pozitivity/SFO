package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.daoservice.PhotoDao;
import ru.domain.Photo;
import ru.repository.PhotoRepository;

@Service("photoDaoService")
@Repository
@Transactional
public class PhotoDaoImpl implements PhotoDao{
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
