package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "photos")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonPhotos {
	@XmlElement(name = "photo")
	private List<JsonPhoto> photos = new ArrayList<JsonPhoto>();
	
	public JsonPhotos(){
		
	}
	
	public JsonPhotos(List<JsonPhoto> photos){
		this.photos = photos;
	}
	
	public List<JsonPhoto> getPhotos(){
		return photos;
	}
	
	public void setPhotos(List<JsonPhoto> photos){
		this.photos = photos;
	}
	
	public void add(JsonPhoto photo){
		this.photos.add(photo);
	}
	
}
