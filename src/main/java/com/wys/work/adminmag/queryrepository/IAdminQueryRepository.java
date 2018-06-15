package com.wys.work.adminmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminQueryRepository {

	public Pager findAdmins2Pager(Map parmas, Pager pager);
	
	public AdminBean findAdminById(Long id);

}