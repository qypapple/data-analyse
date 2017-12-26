package com.goldwind.data.analyse.security.browser.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;



@Component
public class MyUserDetailsService implements UserDetailsService{

	private Logger logger=LoggerFactory.getLogger(getClass());
	/**
	 * 根据用户名查找用户信息
	 */
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		logger.info("用户登录名："+username);
		
		
		return new User(username,"123123",true,true,true,true,AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}

}
