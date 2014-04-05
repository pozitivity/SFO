package ru.service;

import java.util.List;

import ru.domain.Info;

public interface InfoService {
	public Info findOne(Long infoId);
	public List<Info> findAll();
}
