package ru.repository; 

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.Photo;

public interface PhotoRepository extends PagingAndSortingRepository<Photo, Long>{

}
