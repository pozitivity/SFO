package ru.repository;

import java.util.List;

import ru.domain.City;
import ru.domain.TypeUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.domain.User;

public interface UserRepository extends PagingAndSortingRepository<User,Long>{
	public List<User> findByCityAndTypeUser(City city, TypeUser typeUser);
}
