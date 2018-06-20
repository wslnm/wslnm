package com.wys.work.usermag.controller;

import com.wys.work.usermag.queryservice.IUserQueryService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wys.work.beans.UserBean;
import com.wys.work.usermag.handleservice.IUserHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@RequestMapping("/user")
@Controller
public class UserController {

	
	@Resource
	public IUserQueryService userQueryServiceImpl;
	public IUserHandleService userHandleServiceImpl;
	
	
	@RequestMapping(value="/{id}",method= {RequestMethod.PUT})
	public void updateUserBean(UserBean userBean) {
		try {
			userHandleServiceImpl.updateUserBean(userBean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}
	
	@RequestMapping(value="/{id}",method= {RequestMethod.DELETE})
	public void deleteUserBean(UserBean user) {
		try {
			userHandleServiceImpl.deleteUserBean(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return;
	}
	

}