package ru.rest.model.converter;

import java.util.List;

import ru.domain.Logo;
import ru.rest.model.JsonLogo;
import ru.rest.model.JsonLogos;


public class LogoToJsonConverter {

	public static JsonLogo convertEntityToJson(Logo sLogo) {
		JsonLogo jLogo = new JsonLogo();
		jLogo.setLogoId(sLogo.getLogoId());
		jLogo.setLogoName(sLogo.getLogoName());
		jLogo.setLogo(sLogo.getLogo());
		
		return jLogo;
	}
	
	public static Logo convertJsonToEntity(JsonLogo jLogo, Logo sLogo){
		sLogo.setLogoId(jLogo.getLogoId());
		sLogo.setLogoName(jLogo.getLogoName());
		sLogo.setLogo(jLogo.getLogo());
		return sLogo;
	}
	
	public static Logo convertJsonToEntity(JsonLogo jLogo){
		return convertJsonToEntity(jLogo, new Logo());
	}
	public static JsonLogos convertEntityListToJsonList(List<Logo> sLogos){
		JsonLogos jLogos= new JsonLogos();
		for(Logo sLogo:sLogos){
			jLogos.add(convertEntityToJson(sLogo));
		}
		return jLogos;
	}
	
}
