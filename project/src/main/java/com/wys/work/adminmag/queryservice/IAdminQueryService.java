package com.wys.work.adminmag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminQueryService {

	/**
	 * 
	 * @param parmas
	 * @param pager
	 */
	public Pager findAdmins2Pager(Map parmas, Pager pager);

}