package ru.business.service;

import org.springframework.stereotype.Service;

import ru.business.LogEventBusiness;
import ru.daoservice.jpa.LogEventDaoImpl;
import ru.domain.LogEvent;
import ru.domain.LogEvent.Severity;


@Service("logEventBusiness")
public class LogEventBusinessImpl extends LogEventDaoImpl implements LogEventBusiness {

	@Override
	public void warn(String category, String action, String message) {
		warn(category, action, message, null);
	}
	
	@Override
	public void warn(String category, String action, String message,
			String extra) {
		log(LogEvent.Severity.WARN, category, action, message, extra);
	}

	@Override
	public void error(String category, String action, String message) {
		error(category, action, message, null);
	}
	
	@Override
	public void error(String category, String action, String message,
			String extra) {
		log(LogEvent.Severity.ERROR, category, action, message, extra);
	}

	@Override
	public void info(String category, String action, String message) {
		info(category, action, message, null);
	}
	
	@Override
	public void info(String category, String action, String message,
			String extra) {
		log(LogEvent.Severity.INFO, category, action, message, extra);
	}

	@Override
	public void debug(String category, String action, String message) {
		debug(category, action, message, null);
	}
	
	@Override
	public void debug(String category, String action, String message,
			String extra) {
		log(LogEvent.Severity.DEBUG, category, action, message, extra);
	}

	@Override
	public void log(Severity severity, String category, String action,
			String message, String extra) {
		LogEvent le = new LogEvent(severity, category, action, message, extra);
		insert(le);
	}

	@Override
	public void log(Severity severity, String category, String action,
			String message) {
		log(severity, category, action, message, null);
	}

	@Override
	public void log(Severity severity, String category, String message) {
		log(severity, category, null, message);
	}
}
