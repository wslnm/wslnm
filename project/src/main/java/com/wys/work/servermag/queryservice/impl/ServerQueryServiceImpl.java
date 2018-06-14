package com.wys.work.servermag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.servermag.queryrepository.IServerQueryRepository;
import com.wys.work.servermag.queryservice.IServerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerQueryServiceImpl implements IServerQueryService {

	public IServerQueryRepository m_IServerQueryRepository;

	public ServerQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map){
		//public Pager findServers2Pager;

		return null;
	}

}