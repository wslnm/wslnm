package com.wys.work.adminmag.handleservice;

import com.wys.work.beans.AdminBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminHandleService {

	/**
	 * 
	 * @param admin
	 */
	public void deleteAdmin(AdminBean admin);

	/** 
	 * 
	 * @param admin
	 */
	public void saveAdmin(AdminBean admin);

	/**
	 * 修改管理员信息
	 * @param admin
	 */
	public void updateAdmin(AdminBean admin);

}