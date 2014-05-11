package ru.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UnknownAccountException;

import org.apache.shiro.realm.AuthenticatingRealm;

import ru.business.UserBusiness;
import ru.domain.User;

public class UserAccountRealm extends AuthenticatingRealm {

	public static final String USER_REALM = "User_Realm";


	public UserAccountRealm() {
		super();
		//super(new HashedCredentialsMatcher(Sha256Hash.ALGORITHM_NAME));
		setName(USER_REALM);
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// hack
		UserBusiness userBusiness = ((UserNamePasswordTokenEx) token).getUserBussines();
		 
		User user = userBusiness.findByLogin(String.valueOf(token.getPrincipal()));

		if (user == null) {
			throw new UnknownAccountException();
		}
		AuthenticationInfo authenticationInfo = new SimpleAccount(user.getLogin(), user.getPassword(), /*user.getPasswdHash()*/ USER_REALM);
		return authenticationInfo;
	}
	
}
