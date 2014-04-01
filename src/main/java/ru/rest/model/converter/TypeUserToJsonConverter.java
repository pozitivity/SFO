package ru.rest.model.converter;

import java.util.List;


import ru.domain.TypeUser;
import ru.rest.model.JsonTypeUser;
import ru.rest.model.JsonTypeUsers;

public class TypeUserToJsonConverter {

	public static JsonTypeUser convertEntityToJson(TypeUser sTypeUser) {
		JsonTypeUser jTypeUser = new JsonTypeUser();
		jTypeUser.setTypeUserId(sTypeUser.getTypeUserId());
		jTypeUser.setTypeUser(sTypeUser.getTypeUser());;
		
		return jTypeUser;
	}
	
	public static TypeUser convertJsonToEntity(JsonTypeUser jTypeUser, TypeUser sTypeUser){
		sTypeUser.setTypeUserId(jTypeUser.getTypeUserId());;
		sTypeUser.setTypeUser(jTypeUser.getTypeUser());
		return sTypeUser;
	}
	
	public static TypeUser convertJsonToEntity(JsonTypeUser jTypeUser){
		return convertJsonToEntity(jTypeUser, new TypeUser());
	}
	public static JsonTypeUsers convertEntityListToJsonList(List<TypeUser> sTypeUsers){
		JsonTypeUsers jTypeUsers= new JsonTypeUsers();
		for(TypeUser sTypeUser:sTypeUsers){
			jTypeUsers.add(convertEntityToJson(sTypeUser));
		}
		return jTypeUsers;
	}
	
}
