package ru.rest.model.converter;

import java.util.List;

import ru.domain.Rubric;
import ru.rest.model.JsonRubric;
import ru.rest.model.JsonRubrics;



public class RubricToJsonConverter {

	public static JsonRubric convertEntityToJson(Rubric sRubric) {
		JsonRubric jRubric = new JsonRubric();
		jRubric.setRubricId(sRubric.getRubricId());;
		jRubric.setRubricName(sRubric.getRubricName());
		jRubric.setMainRubricId(sRubric.getMainRubricId());
		
		return jRubric;
	}
	
	public static Rubric convertJsonToEntity(JsonRubric jRubric, Rubric sRubric){
		sRubric.setRubricId(jRubric.getRubricId());
		sRubric.setRubricName(jRubric.getRubricName());
		sRubric.setMainRubricId(jRubric.getMainRubricId());
		return sRubric;
	}
	
	public static Rubric convertJsonToEntity(JsonRubric jRubric){
		return convertJsonToEntity(jRubric, new Rubric());
	}
	public static JsonRubrics convertEntityListToJsonList(List<Rubric> sRubrics){
		JsonRubrics jRubrics= new JsonRubrics();
		for(Rubric sRubric:sRubrics){
			jRubrics.add(convertEntityToJson(sRubric));
		}
		return jRubrics;
	}
	
}
