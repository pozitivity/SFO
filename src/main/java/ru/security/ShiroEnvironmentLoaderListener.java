package ru.security;

import javax.servlet.ServletContext;

import org.apache.shiro.mgt.RealmSecurityManager;

import org.apache.shiro.web.env.EnvironmentLoaderListener;
import org.apache.shiro.web.env.WebEnvironment;

public class ShiroEnvironmentLoaderListener extends EnvironmentLoaderListener {
	

	@Override
    protected WebEnvironment createEnvironment(ServletContext pServletContext) {
		WebEnvironment environment = super.createEnvironment(pServletContext);
		RealmSecurityManager rsm = (RealmSecurityManager) environment.getSecurityManager();
		rsm.setRealm(new UserAccountRealm());
		return environment;
	}
}
