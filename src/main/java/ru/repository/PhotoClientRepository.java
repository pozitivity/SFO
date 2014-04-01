package ru.repository; 

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.PhotoClient;

public interface PhotoClientRepository extends PagingAndSortingRepository<PhotoClient, Long>{

}
