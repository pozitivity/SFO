package ru.rest.model.converter;

import java.util.List;

import ru.domain.PhotoClient;
import ru.rest.model.JsonPhotoClient;
import ru.rest.model.JsonPhotoClients;

public class PhotoClientToJsonConverter {

	public static JsonPhotoClient convertEntityToJson(PhotoClient sPhoto) {
		JsonPhotoClient jPhoto = new JsonPhotoClient();
		jPhoto.setPhotoId(sPhoto.getPhotoId());
		jPhoto.setPhoto(sPhoto.getPhoto());
		
		return jPhoto;
	}
	
	public static PhotoClient convertJsonToEntity(JsonPhotoClient jPhoto, PhotoClient sPhoto){
		sPhoto.setPhotoId(jPhoto.getPhotoId());
		sPhoto.setPhoto(jPhoto.getPhoto());
		return sPhoto;
	}
	
	public static PhotoClient convertJsonToEntity(JsonPhotoClient jPhoto){
		return convertJsonToEntity(jPhoto, new PhotoClient());
	}
	public static JsonPhotoClients convertEntityListToJsonList(List<PhotoClient> sPhotos){
		JsonPhotoClients jPhotos= new JsonPhotoClients();
		for(PhotoClient sPhoto:sPhotos){
			jPhotos.add(convertEntityToJson(sPhoto));
		}
		return jPhotos;
	}
}
