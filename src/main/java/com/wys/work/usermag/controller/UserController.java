package com.wys.work.usermag.controller;

import com.wys.work.usermag.queryservice.IUserQueryService;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.MessagerBean;
import com.wys.work.beans.UserBean;
import com.wys.work.usermag.handleservice.IUserHandleService;
import org.springframework.util.StringUtils;
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
	 * 修改用户个人信息
	 * @param userBean
	 */
	@RequestMapping(value="/update")
	public ModelAndView updateUserBean(Long id,String userTel,String userPwd) {
		
		
			ModelAndView modelAndView = new ModelAndView();
			
			UserBean userBean = userHandleServiceImpl.findUserById(id);
			
			if (userTel != null && StringUtils.hasLength(userTel.trim())) {
				userBean.setUserTel(userTel);
			}else {
				userBean.setUserTel(userBean.getUserTel());
			}
			if (userPwd != null && StringUtils.hasLength(userPwd.trim())) {
				userBean.setUserPwd(userPwd);
			}else {
				userBean.setUserPwd(userBean.getUserPwd().trim());
			}
			
			userHandleServiceImpl.updateUserBean(userBean); 
			
			System.out.println("输出："+userBean);
			if ( userTel == null || userPwd == null ||  userTel == "" || userPwd == "")  {
				modelAndView.setViewName("userInfo");
			}else {
				modelAndView.setViewName("frontEndUserSystem");
			}
			return modelAndView;
			
			
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
	@RequestMapping(value="/login",method= {RequestMethod.GET},produces = {"application/json;charset=utf-8"})
	public ModelAndView login(UserBean userbean) {
		ModelAndView mv = new ModelAndView();
			try {
				UserBean user = userQueryServiceImpl.login(userbean.getUserAcc(),userbean.getUserPwd());
				mv.addObject("user", user);
				
				if (user != null) {
					mv.setViewName("userInfo");
				}else {
					mv.setViewName("LoginUser");
				}
				System.out.println("输出的用户对象为："+user);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return mv;
	}

}