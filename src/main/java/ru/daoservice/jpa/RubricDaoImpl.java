package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.daoservice.RubricDao;
import ru.domain.Rubric;
import ru.repository.RubricRepository;

@Service("rubricService")
@Repository
@Transactional
public class RubricDaoImpl implements RubricDao{

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
