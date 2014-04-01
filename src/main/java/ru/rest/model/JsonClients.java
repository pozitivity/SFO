package ru.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "clients")
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonClients {

	@XmlElement(name = "client")
	private List<JsonClient> clients = new ArrayList<JsonClient>();
	
	public JsonClients(){
		
	}
	
	public JsonClients(List<JsonClient> clients){
		this.clients = clients;
	}
	
	public List<JsonClient> getClients(){
		return clients;
	}
	
	public void setClients(List<JsonClient> clients){
		this.clients = clients;
	}
	
	public void add(JsonClient client){
		this.clients.add(client);
	}
}
