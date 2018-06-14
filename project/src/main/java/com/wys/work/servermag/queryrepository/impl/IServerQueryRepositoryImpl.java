package com.wys.work.servermag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.servermag.queryrepository.IServerQueryRepository;
import com.wys.work.servermag.mapper.ServerMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public class IServerQueryRepositoryImpl implements IServerQueryRepository {

	public ServerMapper m_ServerMapper;

	public IServerQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map){
		return null;
	}

}