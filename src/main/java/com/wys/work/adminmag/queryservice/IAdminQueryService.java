package com.wys.work.adminmag.queryservice;

import java.util.Map;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminQueryService {
	
	/**
	 * 根据ID查询Admin
	 * @param id
	 * @return
	 */
	public AdminBean findAdminById(Long id);

	/**
	 * 根据管理员名称、管理员账号、联系电话进行分页查询
	 * @param parmas      
	 * @param pager
	 */
	public Pager findAdmins2Pager(Map parmas, Pager pager);

}