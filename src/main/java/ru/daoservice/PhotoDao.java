package ru.daoservice;

import java.util.List;

import ru.domain.Photo;

public interface PhotoDao {
	public Photo findOne(Long photoId);
	public List<Photo>findAll();
}
