package ru.rest.model.converter;

import java.util.List;

import ru.domain.Photo;
import ru.rest.model.JsonPhoto;
import ru.rest.model.JsonPhotos;

public class PhotoToJsonConverter {

	public static JsonPhoto convertEntityToJson(Photo sPhoto) {
		JsonPhoto jPhoto = new JsonPhoto();
		jPhoto.setPhotoId(sPhoto.getPhotoId());
		jPhoto.setPhotoName(sPhoto.getPhotoName());
		jPhoto.setPhoto(sPhoto.getPhoto());
		
		return jPhoto;
	}
	
	public static Photo convertJsonToEntity(JsonPhoto jPhoto, Photo sPhoto){
		sPhoto.setPhotoId(jPhoto.getPhotoId());
		sPhoto.setPhotoName(jPhoto.getPhotoName());
		sPhoto.setPhoto(jPhoto.getPhoto());
		return sPhoto;
	}
	
	public static Photo convertJsonToEntity(JsonPhoto jPhoto){
		return convertJsonToEntity(jPhoto, new Photo());
	}
	public static JsonPhotos convertEntityListToJsonList(List<Photo> sPhotos){
		JsonPhotos jPhotos= new JsonPhotos();
		for(Photo sPhoto:sPhotos){
			jPhotos.add(convertEntityToJson(sPhoto));
		}
		return jPhotos;
	}
}
