package ru.rest.model.converter;

import java.util.List;

import ru.domain.Client;
import ru.rest.model.JsonClient;
import ru.rest.model.JsonClients;

public class ClientToJsonConverter {
	public static JsonClient convertEntityToJson(Client sClient){
		JsonClient jClient = new JsonClient();
		jClient.setClientId(sClient.getClientId());
		jClient.setFirstName(sClient.getFirstname());
		jClient.setLastName(sClient.getLastname());
		jClient.setPhoto(sClient.getPhotoClient() == null ? null : PhotoClientToJsonConverter.convertEntityToJson(sClient.getPhotoClient()));
		jClient.setUser(sClient.getUser() == null ? null : UserToJsonConverter.convertEntityToJson(sClient.getUser()));
		return jClient;
	}
	
	public static Client convertJsonToEntity(JsonClient jClient, Client sClient){
		sClient.setClientId(jClient.getClientId());
		sClient.setFirstname(jClient.getFirstName());
		sClient.setLastname(jClient.getLastName());
		sClient.setPhotoClient(jClient.getPhoto() == null ? null : PhotoClientToJsonConverter.convertJsonToEntity(jClient.getPhoto()));
		sClient.setUser(jClient.getUser() == null ? null : UserToJsonConverter.convertJsonToEntity(jClient.getUser()));
		return sClient;
	}
	
	public static Client convertJsonToEntity(JsonClient jClient){
		return convertJsonToEntity(jClient, new Client());
	}
	
	public static JsonClients convertEntityListToJsonList(List<Client> sClients){
		JsonClients jClients = new JsonClients();
		for(Client sClient:sClients){
			jClients.add(convertEntityToJson(sClient));
		}
		return jClients;
	}

}
