package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import ru.daoservice.UserDao;
import ru.domain.City;
import ru.domain.TypeUser;
import ru.domain.User;
import ru.repository.UserRepository;

@Service("userService")
@Repository
@Transactional
public class UserDaoImpl implements UserDao{
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

	@Override
	public User findByLogin(String login) {
		return userRepository.findByLogin(login);
	}
}
