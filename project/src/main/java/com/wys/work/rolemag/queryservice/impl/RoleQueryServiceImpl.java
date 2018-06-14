package com.wys.work.rolemag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.rolemag.queryservice.IRoleQueryService;
import com.wys.work.rolemag.queryrepository.IRoleQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public class RoleQueryServiceImpl implements IRoleQueryService {

	public IRoleQueryRepository m_IRoleQueryRepository;

	public RoleQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findRole2Pager(Map map,Pager pager){
		return null;
	}

}