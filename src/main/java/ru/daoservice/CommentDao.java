package ru.daoservice;

import java.util.List;

import ru.domain.Comment;
import ru.domain.Organization;

public interface CommentDao {
	public Comment findOne(Long commentId);
	public List<Comment> findAll();
	public List<Comment> findByOrganization(Organization organization);
}
