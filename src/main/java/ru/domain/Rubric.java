package ru.domain;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "rubric")
public class Rubric implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "rubric_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rubricId;
	
	@Column(name = "rubric_name")
	private String rubricName;
	
	
	@Column(name = "main_rubric_id")
	private Long mainRubricId;
	
	public Rubric(){
		
	}
	
	public Rubric(Long rubricId,Long mainRubricId, String rubricName){
		this.mainRubricId = mainRubricId;
		this.rubricName = rubricName;
		this.rubricId = rubricId;
		
	}
	
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

