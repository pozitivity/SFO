package ru.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.domain.Info;

public interface InfoRepository extends PagingAndSortingRepository<Info, Long>{

}

