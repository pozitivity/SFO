package ru.business.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ru.business.UserBusiness;
import ru.daoservice.UserDao;
import ru.domain.User;


@Service("userBusiness")
@Scope("session")
public class UserBusinessImpl implements UserBusiness {
    private static Logger LOG = LoggerFactory.getLogger(UserBusinessImpl.class);   
	
	@Autowired
	private UserDao userService;

	@Override
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@Override
	public User findByLogin(String login) {
		return userService.findByLogin(login);
	}

	@Override
	public User findOne(Long id) {
		return userService.findOne(id);
	}

	@Override
	public User update(User t) {
		return userService.update(t);
	}

	@Override
	public User insert(User t) {
		return userService.insert(t);
	}

	@Override
	public void delete(User t) {
		userService.delete(t);
	}

	
	@Override
	public void sendChangeEmail(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendCreationEmail(User t) {
		// TODO Auto-generated method stub
		
	}
	
}
