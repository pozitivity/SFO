package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import ru.domain.City;
import ru.domain.TypeUser;
import ru.domain.User;
import ru.repository.UserRepository;
import ru.service.UserService;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User findOne(Long userId){
		return userRepository.findOne(userId);
	}
	
	@Transactional(readOnly = true)
	public List<User>findAll(){
		return (List<User>)userRepository.findAll();
	}
	
	@Override
	public List<User>findByCityAndTypeUser(City city, TypeUser typeUser){
		return userRepository.findByCityAndTypeUser(city, typeUser);
	}
}
