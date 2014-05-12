package ru.business;

import ru.daoservice.LogEventDao;
import ru.domain.LogEvent;

public interface LogEventBusiness extends LogEventDao {

	void warn(String category, String action, String message);
	void error(String category, String action, String message);
	void info(String category, String action, String message);
	void debug(String category, String action, String message);
	void warn(String category, String action, String message, String extra);
	void error(String category, String action, String message, String extra);
	void info(String category, String action, String message, String extra);
	void debug(String category, String action, String message, String extra);
	void log(LogEvent.Severity severity, String category, String action, String message, String extra);
	void log(LogEvent.Severity severity, String category, String action, String message);
	void log(LogEvent.Severity severity, String category, String message);
}
