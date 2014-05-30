package ru.daoservice;

import java.util.List;

import ru.domain.Rubric;

public interface RubricDao {
	public Rubric findOne(Long rubricId);
	public List<Rubric> findAll();
	public List<Rubric> findByMainRubricId(Long id);
	public Rubric findByName(String name);
	
}
