package ru.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.domain.Rubric;
import ru.repository.RubricRepository;
import ru.service.RubricService;

@Service("rubricService")
@Repository
@Transactional
public class RubricServiceImpl implements RubricService{

	@Autowired
	private RubricRepository rubricRepository;
	
	@Transactional(readOnly = true)
	public List<Rubric>findAll(){
		return (List<Rubric>)rubricRepository.findAll();
	}

	@Override
	public Rubric findOne(Long rubricId) {
		return rubricRepository.findOne(rubricId);
	}

	@Override
	public List<Rubric> findByMainRubricId(Long id) {
		return (List<Rubric>)rubricRepository.findByMainRubricId(id);
	}
}
