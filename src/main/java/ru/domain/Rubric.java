package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;;

@Entity
@Table(name = "rubric")
public class Rubric implements Serializable {
	@Id
	@Column(name = "rubric_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy = "main_rubric", fetch = FetchType.EAGER)
	private Long rubricId;
	
	@Column(name = "rubric_name")
	private String rubricName;
	
	@Column(name = "main_id")
	private Long mainRubricId;
	
	
	public Rubric(){
		
	}
	
	public Rubric(Long rubricId,Long mainRubricId, String rubricName){
		this.mainRubricId = mainRubricId;
		this.rubricName = rubricName;
		this.rubricId = rubricId;
		
	}
	
	public Long getRubricId(){
		return mainRubricId;
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
	
	public void setMainRubricId(Long MainRubricId){
		this.mainRubricId = mainRubricId;
	}
}

