package ru.daoservice;

import java.util.List;

import ru.domain.Info;

public interface InfoDao {
	public Info findOne(Long infoId);
	public List<Info> findAll();
	public void save(Info info);
}
