package ru.session;

import java.io.Serializable;
import java.text.MessageFormat;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.business.LogEventBusiness;

@Component
@Scope("session")
public class UserSession implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final int MAX_FAIL_COUNT = 5;
	
	@Autowired
	LogEventBusiness logEventBusiness;
	
	@Inject
	private HttpSession session;
	
	private int failCount;
	
	private boolean isLocked;
	
	public void loggedIn(String realIp, String userAgent, String login) {
		logEventBusiness.info("SESSION", "LOGIN", 
				MessageFormat.format("User {0} has logged in from session {1}, ip {3} after {2} unsuccessfull attempts.", 
						login, session, failCount, realIp), userAgent);
		failCount = 0;
	}
	
	public void loggedOut(String realIp, String userAgent, String login) {
		logEventBusiness.info("SESSION", "LOGOUT", 
				MessageFormat.format("User {0} has logged out from session {1}, ip {2}.", login, session, realIp), userAgent);
	}
	
	public void loginFailed(String realIp, String userAgent, String login, String reason) {
		failCount++;
		logEventBusiness.warn("SESSION", "FAIL", 
				MessageFormat.format("Unknown user has tried to log in as {0} from session {1}, ip {3} unsuccessfully. {4}. Fail count is {2}.", 
						login, session, failCount, realIp, reason), userAgent);
		if (failCount == MAX_FAIL_COUNT) {
			isLocked = true;
			logEventBusiness.warn("SESSION", "LOCK", MessageFormat.format("Seems like break-in attempt. Session {0} is locked.", 
					session.getId()));
		}
	}
	
	public void loginRejected(String realIp, String userAgent, String login, String reason) {
		logEventBusiness.warn("SESSION", "REJECTED", 
				MessageFormat.format("Login attempt as user {0} from ip {1} has been rejected in session {2}. {3}.", 
						login, realIp, session, reason), userAgent);
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	@PreDestroy
	public void dealloc() {
		
	}
	
}
