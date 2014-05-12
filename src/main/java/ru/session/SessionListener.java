package ru.session;

import java.text.MessageFormat;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;

import ru.business.LogEventBusiness;

public class SessionListener implements HttpSessionListener {

	@Autowired
	private LogEventBusiness logEventBussinnes;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		logEventBussinnes.info("SESSION", "OPEN", MessageFormat.format("New session {0} has been opened.", se.getSession()));
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		logEventBussinnes.info("SESSION", "CLOSE", MessageFormat.format("Existing session {0} has been closed", se.getSession()));
		
	}
	
}
