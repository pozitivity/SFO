package ru.repository;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.domain.Client;
import ru.domain.User;
import ru.domain.Photo;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long>{

	public List<Client> findByUserAndPhotoClient(User user, Photo photo);
}
