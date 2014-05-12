package ru.business;


import ru.domain.User;

public interface UserBusiness extends BaseBussiness<User> {       	
	User findByLogin(String login);
}
