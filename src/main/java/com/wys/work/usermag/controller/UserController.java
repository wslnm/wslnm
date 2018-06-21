package com.wys.work.usermag.controller;

import com.wys.work.usermag.queryservice.IUserQueryService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wys.work.beans.MessagerBean;
import com.wys.work.beans.UserBean;
import com.wys.work.usermag.handleservice.IUserHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@RequestMapping("/user")
@RestController
public class UserController {

	
	@Resource
	public IUserQueryService userQueryServiceImpl;
	@Resource
	public IUserHandleService userHandleServiceImpl;
	
	/**
	 * 修改
	 * @param userBean
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.PUT},produces = {"application/json;charset=utf-8"})
	public void updateUserBean(UserBean userBean) {
			userHandleServiceImpl.updateUserBean(userBean);
	}
	
	/**
	 * 删除
	 * @param user
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.DELETE},produces = {"application/json;charset=utf-8"})
	public void deleteUserBean(UserBean user) {
			userHandleServiceImpl.deleteUserBean(user);
	}
	
	/**
	 * 新增
	 * @param user
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.POST},produces = {"application/json;charset=utf-8"})
	public MessagerBean saveUserBean(UserBean user) {
		MessagerBean messagerBean = new MessagerBean(true,0,"操作成功");
		try {   
			user.setId(0);
			userHandleServiceImpl.saveUserBean(user);
			
		} catch (Exception e) {
			messagerBean.setCode(-1);
			messagerBean.setStatus(false);
			messagerBean.setInformation("操作失败");
		}
		return messagerBean;
	}
	
	/**
	 * 登录查询账号密码
	 * @param userAcc
	 * @param userPwd
	 * @return 用户对象
	 */
	@RequestMapping(value="/{userAcc}/{userPwd}",method= {RequestMethod.GET},produces = {"application/json;charset=utf-8"})
	public MessagerBean login(@PathVariable("userAcc") String userAcc,@PathVariable("userPwd") String userPwd) {
		MessagerBean messagerBean = new MessagerBean(true,0,"操作成功");
		try {   
			UserBean user = userQueryServiceImpl.login(userAcc, userPwd);
			System.out.println(user);
			if (user!=null) {
				messagerBean = new MessagerBean(true,0,"操作成功");
			} else {
				messagerBean.setCode(-1);
				messagerBean.setStatus(false);
				messagerBean.setInformation("操作失败");
			}
		} catch (Exception e) {
			messagerBean.setCode(-1);
			messagerBean.setStatus(false);
			messagerBean.setInformation("操作失败");
		}
		return messagerBean;
	}
	
	

}