package ru.daoservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ru.daoservice.LogEventDao;
import ru.domain.LogEvent;
import ru.domain.LogEvent.Severity;
import ru.repository.LogEventRepository;

public class LogEventDaoImpl implements LogEventDao {

	@Autowired
	private LogEventRepository logEventRepository;

	@Override
	public LogEvent findByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(LogEvent logEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LogEvent update(LogEvent logEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(LogEvent logEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LogEvent> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogEvent> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogEvent> findBySeverity(Severity severity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogEvent> findByCategoryAndSeverity(String category,
			Severity severity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LogEvent> findLast() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
