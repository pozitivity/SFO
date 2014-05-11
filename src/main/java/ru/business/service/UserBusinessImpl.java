package ru.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ru.business.UserBusiness;
import ru.daoservice.UserDao;
import ru.domain.User;

@Service("userBusiness")
@Scope("session")
public class UserBusinessImpl implements UserBusiness {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findByLogin(String login) {
		return userDao.findByLogin(login);
	}

}
