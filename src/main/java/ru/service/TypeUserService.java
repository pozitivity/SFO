package ru.service;

import java.util.List;

import ru.domain.TypeUser;

public interface TypeUserService {
	public TypeUser findOne(Long typeUserId);
	public List<TypeUser>findAll();
}
