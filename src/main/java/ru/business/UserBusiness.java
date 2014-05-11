package ru.business;

import java.util.List;

import ru.domain.User;

public interface UserBusiness {
	public List<User> findAll();
	
	User findByLogin(String login);
}
