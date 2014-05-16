package ru.daoservice;

import java.util.List;

import ru.domain.City;
import ru.domain.TypeUser;
import ru.domain.User;

public interface UserDao extends BaseDao<User> {
	public User findOne(Long userId);
	
	public List<User> findAll();
	public List<User>findByCityAndTypeUser(City city, TypeUser typeUser);
	public User findByLogin(String login);
	public void save(User user);
}
