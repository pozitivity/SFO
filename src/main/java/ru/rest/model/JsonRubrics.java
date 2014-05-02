package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rubrics")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonRubrics {

	@XmlElement(name = "rubric")
	private List<JsonRubric> rubrics = new ArrayList<JsonRubric>();
	
	public JsonRubrics(){
		
	}
	
	public JsonRubrics(List<JsonRubric> rubrics){
		this.rubrics = rubrics;
	}
	
	public List<JsonRubric> getRubrics(){
		return rubrics;
	}
	
	public void setRubrics(List<JsonRubric> rubrics){
		this.rubrics = rubrics;
	}
	
	public void add(JsonRubric rubric){
		this.rubrics.add(rubric);
	}

}
