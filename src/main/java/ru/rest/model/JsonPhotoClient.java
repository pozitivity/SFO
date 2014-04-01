package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "photo_client")
public class JsonPhotoClient {

	private Long photoId;
	
	private String photo;
	
	public Long getPhotoId(){
		return photoId;
	}
	
	public void setPhotoId(Long photoId){
		this.photoId = photoId;
	}
	
	public String getPhoto(){
		return photo;
	}
	
	public void setPhoto(String photo){
		this.photo = photo;
	}
}
