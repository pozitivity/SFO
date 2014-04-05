package ru.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "info")
public class JsonInfo {

	private Long infoId;
	
	private String info;
	
	public Long getInfoId(){
		return infoId;
	}
	
	public void setInfoId(Long infoId){
		this.infoId = infoId;
	}
	
	public String getInfo(){
		return info;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
}