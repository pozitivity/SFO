package ru.service;

import java.util.List;

import ru.domain.PhotoClient;

public interface PhotoClientService {
	public PhotoClient findOne(Long photoId);
	public List<PhotoClient>findAll();
}
