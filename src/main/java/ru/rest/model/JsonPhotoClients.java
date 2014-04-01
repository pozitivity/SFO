package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "photo_clients")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonPhotoClients {
	@XmlElement(name = "photo_client")
	private List<JsonPhotoClient> photos = new ArrayList<JsonPhotoClient>();
	
	public JsonPhotoClients(){
		
	}
	
	public JsonPhotoClients(List<JsonPhotoClient> photos){
		this.photos = photos;
	}
	
	public List<JsonPhotoClient> getPhotos(){
		return photos;
	}
	
	public void setPhotos(List<JsonPhotoClient> photos){
		this.photos = photos;
	}
	
	public void add(JsonPhotoClient photo){
		this.photos.add(photo);
	}
	
}
