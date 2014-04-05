package ru.rest.model.converter;

import java.util.List;

import ru.domain.Info;
import ru.rest.model.JsonInfo;
import ru.rest.model.JsonInfos;



public class InfoToJsonConverter {

	public static JsonInfo convertEntityToJson(Info sInfo) {
		JsonInfo jInfo = new JsonInfo();
		jInfo.setInfoId(sInfo.getInfoId());
		jInfo.setInfo(sInfo.getInfo());
		
		return jInfo;
	}
	
	public static Info convertJsonToEntity(JsonInfo jInfo, Info sInfo){
		sInfo.setInfoId(jInfo.getInfoId());
		sInfo.setInfo(jInfo.getInfo());
		return sInfo;
	}
	
	public static Info convertJsonToEntity(JsonInfo jInfo){
		return convertJsonToEntity(jInfo, new Info());
	}
	public static JsonInfos convertEntityListToJsonList(List<Info> sInfos){
		JsonInfos jInfos= new JsonInfos();
		for(Info sInfo:sInfos){
			jInfos.add(convertEntityToJson(sInfo));
		}
		return jInfos;
	}
}
