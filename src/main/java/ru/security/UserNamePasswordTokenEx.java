package ru.security;

import org.apache.shiro.authc.UsernamePasswordToken;

import ru.business.UserBusiness;

public class UserNamePasswordTokenEx extends UsernamePasswordToken {

	private UserBusiness userBussines;

	public UserNamePasswordTokenEx(final String username, String password, UserBusiness userBussines) {
		super(username, password);
		this.userBussines = userBussines;
	}

	public UserBusiness getUserBussines() {
		return userBussines;
	}

}

