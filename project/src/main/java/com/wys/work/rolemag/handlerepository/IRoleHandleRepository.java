package com.wys.work.rolemag.handlerepository;

import com.wys.work.beans.RoleBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IRoleHandleRepository {

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