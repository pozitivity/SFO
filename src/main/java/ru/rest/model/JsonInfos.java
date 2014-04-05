package ru.rest.model;

import java.util.List;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "infos")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonInfos {
	@XmlElement(name = "info")
	private List<JsonInfo> infos = new ArrayList<JsonInfo>();
	
	public JsonInfos(){
		
	}
	
	public JsonInfos(List<JsonInfo> infos){
		this.infos = infos;
	}
	
	public List<JsonInfo> getInfos(){
		return infos;
	}
	
	public void setInfos(List<JsonInfo> infos){
		this.infos = infos;
	}
	
	public void add(JsonInfo info){
		this.infos.add(info);
	}

}
