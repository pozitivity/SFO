package ru.service;

import java.util.List;

import ru.domain.Client;
import ru.domain.Photo;
import ru.domain.User;



public interface ClientService {

	public Client findOne(Long clientId);
	public List<Client> findAll();
	public List<Client> findByUserAndPhotoClient(User user, Photo photo);
	public Client save(Client client);
	public void delete(Client client);
}
