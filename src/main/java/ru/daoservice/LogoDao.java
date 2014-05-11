package ru.daoservice;

import java.util.List;

import ru.domain.Logo;

public interface LogoDao {
	public Logo findOne(Long logoId);
	public List<Logo> findAll();
	public Logo save(Logo logo);
}
