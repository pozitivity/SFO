package ru.service;

import java.util.List;

import ru.domain.Client;
import ru.domain.Comment;
import ru.domain.Organization;

public interface CommentService {
	public Comment findOne(Long commentId);
	public List<Comment> findAll();
	public List<Comment> findByOrganizationAndClient(Organization organization, Client client);
}
