package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rubric")
public class JsonRubric {

	private Long rubricId;
	
	private String name;
	
	private Long mainRubricId;
	
	public Long getRubricId(){
		return rubricId;
	}
	
	public void setRubricId(Long rubricId){
		this.rubricId = rubricId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Long getMainRubricId(){
		return mainRubricId;
	}
	
	public void setMainRubricId(Long mainRubricId){
		this.mainRubricId = mainRubricId;
	}
}
