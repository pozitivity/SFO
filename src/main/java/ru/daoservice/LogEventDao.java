package ru.daoservice;

import java.util.List;

import ru.domain.LogEvent;

public interface LogEventDao {
	public LogEvent findByUuid(String uuid);
	public void insert(LogEvent logEvent);
	public LogEvent update(LogEvent logEvent);
	public void delete(LogEvent logEvent);
	public List<LogEvent> findAll();
	public List<LogEvent> findByCategory(String category);
	public List<LogEvent> findBySeverity(LogEvent.Severity severity);
	public List<LogEvent> findByCategoryAndSeverity(String category, LogEvent.Severity severity);
	public List<LogEvent> findLast();
}
