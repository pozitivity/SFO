package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "photo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long photoId;
	
	@Lob
	@Column(name = "photo", columnDefinition = "mediumblob")
	private byte[] photo;
	
	@Column(name = "photo_name")
	private String photoName;

	public Photo(){
		
	}
	
	public Photo(Long photoId, byte[] photo, String photoName){
		this.photoId = photoId;
		this.photo = photo;
		this.photoName = photoName;
	}
	
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public Long getPhotoId(){
		return photoId;
	}
	
	public void setPhotoId(Long photoId){
		this.photoId = photoId;
	}

	
}
