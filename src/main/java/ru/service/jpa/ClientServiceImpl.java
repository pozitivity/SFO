package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.Client;
import ru.domain.Photo;
import ru.domain.User;
import ru.repository.ClientRepository;
import ru.service.ClientService;



@Service("clientService")
@Repository
@Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public Client findOne(Long clientId){
		return clientRepository.findOne(clientId);
	}
	
	@Transactional(readOnly = true)
	public List<Client> findAll(){
		return (List<Client>) clientRepository.findAll();
	}
	
	@Override
	public List<Client> findByUserAndPhotoClient(User user, Photo photo){
		return clientRepository.findByUserAndPhotoClient(user, photo);
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Client client) {
		clientRepository.delete(client);
		
	}
}
