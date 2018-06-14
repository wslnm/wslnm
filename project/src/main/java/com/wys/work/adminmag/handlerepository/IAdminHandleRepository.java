package com.wys.work.adminmag.handlerepository;

import com.wys.work.beans.AdminBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminHandleRepository {

	/**
	 * 
	 * @param admin
	 */
	public void delete(AdminBean admin);

	/**
	 * 
	 * @param admin
	 */
	public void save(AdminBean admin);

	/**
	 * 
	 * @param admin
	 */
	public void update(AdminBean admin);

}