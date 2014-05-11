package ru.daoservice;

import java.util.List;

import ru.domain.TypeUser;

public interface TypeUserDao {
	public TypeUser findOne(Long typeUserId);
	public List<TypeUser>findAll();
}
