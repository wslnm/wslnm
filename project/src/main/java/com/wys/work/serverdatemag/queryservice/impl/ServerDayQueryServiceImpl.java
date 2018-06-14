package com.wys.work.serverdatemag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryservice.IServerDayQueryService;
import com.wys.work.serverdatemag.queryrepository.IServerDayQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerDayQueryServiceImpl implements IServerDayQueryService {

	public IServerDayQueryRepository m_IServerDayQueryRepository;

	public ServerDayQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerDay2Pager(Pager pager, Map parmas){
		return null;
	}

}