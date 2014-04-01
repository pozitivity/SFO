package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rubric")
public class JsonRubric {

	private Long rubricId;
	
	private String rubricName;
	
	private Long mainRubricId;
	
	public Long getRubricId(){
		return rubricId;
	}
	
	public void setRubricId(Long rubricId){
		this.rubricId = rubricId;
	}
	
	public String getRubricName(){
		return rubricName;
	}
	
	public void setRubricName(String rubricName){
		this.rubricName = rubricName;
	}
	
	public Long getMainRubricId(){
		return mainRubricId;
	}
	
	public void setMainRubricId(Long mainRubricId){
		this.mainRubricId = mainRubricId;
	}
}
