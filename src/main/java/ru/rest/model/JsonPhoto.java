package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "photo")
public class JsonPhoto {

	
	private Long photoId;
	
	private String photoName;
	
	private byte[] photo;
	
	public Long getPhotoId(){
		return photoId;
	}
	
	public void setPhotoId(Long photoId){
		this.photoId = photoId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	
}
