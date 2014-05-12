package ru.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ru.domain.LogEvent;

public interface LogEventRepository extends PagingAndSortingRepository<LogEvent, Long> {
	  
}
