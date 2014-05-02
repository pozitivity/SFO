package ru.service;

import java.util.List;

import ru.domain.Rubric;

public interface RubricService {
	public Rubric findOne(Long rubricId);
	public List<Rubric> findAll();
	public List<Rubric> findByMainRubricId(Long id);
	
}
