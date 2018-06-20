package com.wys.work.usermag.handleservice.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.UserBean;
import com.wys.work.usermag.handleservice.IUserHandleService;
import com.wys.work.usermag.handlerepository.IUserHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Service
public class UserHandleServiceImpl implements IUserHandleService {

	@Resource
	private IUserHandleRepository userHandleRepositorys;

	/**
	 * 
	 * @param user
	 */
	public void deleteUserBean(UserBean user){
		userHandleRepositorys.delete(user);
	}

	/**
	 * 
	 * @param user
	 */
	public void saveUserBean(UserBean user){
		userHandleRepositorys.save(user);
	}


	@Override
	public List<UserBean> saveUserBeans(List<UserBean> userBeans) {
		// TODO Auto-generated method stub
		return userHandleRepositorys.save(userBeans);
	}

	@Override
	public void updateUserBean(UserBean user) {
		// TODO Auto-generated method stub
		userHandleRepositorys.saveAndFlush(user);
	}
	

}