package ru.service.jpa;

import java.util.List;

import ru.repository.CommentRepository;
import ru.service.CommentService;
import ru.domain.Comment;
import ru.domain.Organization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("commentService")
@Repository
@Transactional
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Transactional(readOnly = true)
	public Comment findOne(Long commentId){
		return commentRepository.findOne(commentId);
	}
	
	@Transactional(readOnly = true)
	public List<Comment> findAll(){
		return (List<Comment>)commentRepository.findAll();
	}
	
	@Override
	public List<Comment> findByOrganization(Organization organization){
		return commentRepository.findByOrganization(organization);
	}
}
