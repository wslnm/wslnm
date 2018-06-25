package com.wys.work.usermag.handleservice;

import java.util.List;

import com.wys.work.beans.UserBean;

/**
 * �û���  handle�� ҵ���ӿ�
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface IUserHandleService {

	/**
	 * 删除用户
	 * @param user
	 */
	public void deleteUserBean(UserBean user);

	/**
	 * 新增用户
	 * @param user
	 */
	public void saveUserBean(UserBean user);

	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUserBean(UserBean userBean);
	
	/**
	 * 批量新增用户
	 * @param userBeans
	 * @return
	 */
	public List<UserBean> saveUserBeans(List<UserBean> userBeans);
	
	/**
	 * 通过Id查询用户
	 * @param id
	 */
	public UserBean findUserById(Long id);

}