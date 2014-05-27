package ru.rest.model.converter;

import java.util.List;

import ru.domain.User;
import ru.rest.model.JsonUser;
import ru.rest.model.JsonUsers;



public class UserToJsonConverter {
	
	public static JsonUser convertEntityToJson(User sUser) {
		JsonUser jUser = new JsonUser();
		jUser.setUserId(sUser.getUserId());
		jUser.setBlocked(sUser.getBlocked());
		jUser.setCity(sUser.getCity() == null ? null : CityToJsonConverter.convertEntityToJson(sUser.getCity()));
		jUser.setLogin(sUser.getLogin());
		jUser.setPassword(sUser.getPassword());
		jUser.setTypeUser(sUser.getTypeUser() == null ? null : TypeUserToJsonConverter.convertEntityToJson(sUser.getTypeUser()));
		jUser.setEmail(sUser.getEmail());
		
		return jUser;
	}
	
	public static User convertJsonToEntity(JsonUser jUser, User sUser){
		sUser.setUserId(jUser.getUserId());
		sUser.setBlocked(jUser.getBlocked());
		sUser.setCity(jUser.getCity() == null ? null : CityToJsonConverter.convertJsonToEntity(jUser.getCity()));
		sUser.setLogin(jUser.getLogin());
		sUser.setPassword(jUser.getPassword());
		sUser.setTypeUser(jUser.getTypeUser() == null ? null : TypeUserToJsonConverter.convertJsonToEntity(jUser.getTypeUser()));
		sUser.setEmail(jUser.getEmail());
		
		return sUser;
	}
	
	public static User convertJsonToEntity(JsonUser jUser){
		return convertJsonToEntity(jUser, new User());
	}
	public static JsonUsers convertEntityListToJsonList(List<User> sUsers){
		JsonUsers jUsers= new JsonUsers();
		for(User sUser:sUsers){
			jUsers.add(convertEntityToJson(sUser));
		}
		return jUsers;
	}

}
