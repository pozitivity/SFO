package ru.domain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class PhotoClient implements Serializable {

	@Id
	@Column(name = "photo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long photoId;
	
	@Column(name = "photo")
	private String photo;
	
//	@OneToOne(mappedBy = "photoClient", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.MERGE)
//	private List<Client> contacts = new LinkedList<Client>();
	
	@OneToOne(optional = false, mappedBy = "photoClient", fetch = FetchType.EAGER, 
	cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private Client contacts;

	public PhotoClient(){
		
	}
	
	public PhotoClient(Long photoId, String photo){
		this.photoId = photoId;
		this.photo = photo;
	}
	
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

	public Client getContacts() {
		return contacts;
	}

	public void setContacts(Client contacts) {
		this.contacts = contacts;
	}
	
}
