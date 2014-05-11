package ru.session;

import java.io.Serializable;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class UserSession implements Serializable {

	@Inject
	private HttpSession session;
	
	private int failCount;
	
	private boolean isLocked;
	
	public boolean isLocked() {
		return isLocked;
	}
	
	@PreDestroy
	public void dealloc() {
		
	}
	
}
