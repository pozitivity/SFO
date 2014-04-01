package ru.domain;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "comment")
public class Comment implements Serializable{
	
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "organization_id")
	private Organization organization ;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	public Comment(){
		
	}
	
	public Comment(Long commentId, String comment, Organization organization, Client client){
		this.commentId = commentId;
		this.comment = comment;
		this.organization = organization;
		this.client = client;
		
	}
	
	public Long getCommentId(){
		return commentId;
	}
	
	public void setCommentId(Long commentId){
		this.commentId = commentId;
	}
	
	public String getComment(){
		return comment;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	
	public Organization getOrganization(){
		return organization;
	}
	
	public void setOrganization(Organization organization){
		this.organization = organization;
	}
	
	public Client getClient(){
		return client;
	}
	
	public void setClient(Client client){
		this.client = client;
	}

}


