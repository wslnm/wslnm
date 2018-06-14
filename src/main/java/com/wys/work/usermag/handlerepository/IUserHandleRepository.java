package com.wys.work.usermag.handlerepository;

import com.wys.work.beans.UserBean;

/**
 * �û��� handle�־ò�
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface IUserHandleRepository {

	/**
	 * 
	 * @param user
	 */
	public void deleteUserBean(UserBean user);

	/**
	 * 
	 * @param user
	 */
	public void saveUserBean(UserBean user);

	/**
	 * 
	 * @param user
	 */
	public void updateUserBean(UserBean user);

}