package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryrepository.IServerDayQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerDayMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerDayQueryRepositoryImpl implements IServerDayQueryRepository {

	public ServerDayMapper m_ServerDayMapper;

	public ServerDayQueryRepositoryImpl(){

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