package com.wys.work.rolemag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.rolemag.queryrepository.IRoleQueryRepository;
import com.wys.work.rolemag.mapper.RoleMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public class RoleQueryRepositoryImpl implements IRoleQueryRepository {

	public RoleMapper m_RoleMapper;

	public RoleQueryRepositoryImpl(){

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