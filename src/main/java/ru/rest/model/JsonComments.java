package ru.rest.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "comments")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonComments {

	@XmlElement(name = "comment")
	private List<JsonComment> comments = new ArrayList<JsonComment>();
	
	public JsonComments(){
		
	}
	
	public JsonComments(List<JsonComment> comments){
		this.comments = comments;
	}
	
	public List<JsonComment> getComments(){
		return comments;
	}
	
	public void setComments(List<JsonComment> comments){
		this.comments = comments;
	}
	
	public void add(JsonComment comment){
		this.comments.add(comment);
	}
	
}
