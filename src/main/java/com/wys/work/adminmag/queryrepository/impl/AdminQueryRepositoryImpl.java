package com.wys.work.adminmag.queryrepository.impl;

import com.wys.work.beans.Pager;

import java.util.Map;

import com.wys.work.adminmag.mapper.AdminMapper;
import com.wys.work.adminmag.queryrepository.IAdminQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public class AdminQueryRepositoryImpl implements IAdminQueryRepository {

	public AdminMapper m_AdminMapper;

	public AdminQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param parmas
	 * @param pager
	 */
	public Pager findAdmins2Pager(Map parmas, Pager pager){
		//public Pager findAdmins2Pager;

		return null;
	}


}