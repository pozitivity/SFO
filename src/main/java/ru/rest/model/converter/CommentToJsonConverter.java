package ru.rest.model.converter;

import java.util.List;

import ru.domain.Comment;
import ru.rest.model.JsonComment;
import ru.rest.model.JsonComments;


public class CommentToJsonConverter {

	public static JsonComment convertEntityToJson(Comment sComment) {
		JsonComment jComment = new JsonComment();
		jComment.setCommentId(sComment.getCommentId());
		jComment.setComment(sComment.getComment());
		
		return jComment;
	}
	
	public static Comment convertJsonToEntity(JsonComment jComment, Comment sComment){
		sComment.setCommentId(jComment.getCommentId());
		sComment.setComment(jComment.getComment());
		return sComment;
	}
	
	public static Comment convertJsonToEntity(JsonComment jComment){
		return convertJsonToEntity(jComment, new Comment());
	}
	public static JsonComments convertEntityListToJsonList(List<Comment> sComments){
		JsonComments jComments= new JsonComments();
		for(Comment sComment:sComments){
			jComments.add(convertEntityToJson(sComment));
		}
		return jComments;
	}
	
}
