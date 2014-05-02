package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "comment")
public class JsonComment {
	
	private Long commentId;
	
	private String comment;
	
	private JsonOrganization organization;
	
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
	
	public JsonOrganization getOrganization(){
		return organization;
	}
	
	public void setOrganization(JsonOrganization organization){
		this.organization = organization;
	}

}
