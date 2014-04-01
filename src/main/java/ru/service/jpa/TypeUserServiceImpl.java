package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.TypeUser;
import ru.repository.TypeUserRepository;
import ru.service.TypeUserService;

@Service("typeuserService")
@Repository
@Transactional
public class TypeUserServiceImpl implements TypeUserService{
	@Autowired
	private TypeUserRepository typeUserRepository;
	
	@Transactional(readOnly = true)
	public TypeUser findOne(Long typeUserId){
		return typeUserRepository.findOne(typeUserId);
	}
	
	@Transactional(readOnly = true)
	public List<TypeUser>findAll(){
		return (List<TypeUser>)typeUserRepository.findAll();
	}
}
