package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.daoservice.TypeUserDao;
import ru.domain.TypeUser;
import ru.repository.TypeUserRepository;

@Service("typeuserService")
@Repository
@Transactional
public class TypeUserDaoImpl implements TypeUserDao{
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
