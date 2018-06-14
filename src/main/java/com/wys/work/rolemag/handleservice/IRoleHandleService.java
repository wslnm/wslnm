package com.wys.work.rolemag.handleservice;

import com.wys.work.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IRoleHandleService {

	/**
	 * 
	 * @param role
	 */
	public void deleteRole(RoleBean role);

	/**
	 * 
	 * @param role
	 */
	public void saveRole(RoleBean role);

	/**
	 * 
	 * @param role
	 */
	public void updateRole(RoleBean role);

}