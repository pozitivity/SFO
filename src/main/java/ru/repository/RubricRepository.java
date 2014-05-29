package ru.repository;

import java.util.List;

import ru.domain.Rubric;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RubricRepository extends PagingAndSortingRepository<Rubric,Long>{
	public List<Rubric> findByMainRubricId(Long id);
	//public List<Rubric> findByRubric(Long mainRubricId)
}
	