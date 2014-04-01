package ru.repository;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.Comment;
import ru.domain.Client;
import ru.domain.Organization;

public interface CommentRepository extends PagingAndSortingRepository<Comment,Long>{
	public List<Comment> findByOrganizationAndClient(Organization organization, Client client);
}
