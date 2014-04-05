package ru.service;

import java.util.List;

import ru.domain.Logo;

public interface LogoService {
	public Logo findOne(Long logoId);
	public List<Logo> findAll();
	public Logo save(Logo logo);
}
