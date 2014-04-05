package ru.service;

import java.util.List;

import ru.domain.Photo;

public interface PhotoService {
	public Photo findOne(Long photoId);
	public List<Photo>findAll();
}
