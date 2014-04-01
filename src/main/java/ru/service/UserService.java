package ru.service;

import java.util.List;

import ru.domain.City;
import ru.domain.TypeUser;
import ru.domain.User;

public interface UserService {
	public User findOne(Long userId);
	public List<User> findAll();
	public List<User>findByCityAndTypeUser(City city, TypeUser typeUser);
}
