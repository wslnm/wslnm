package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryrepository.IServerYearQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerYearMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerYearQueryRepositoryImpl implements IServerYearQueryRepository {

	public ServerYearMapper m_ServerYearMapper;

	public ServerYearQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pager(Pager pager, Map parmas){
		return null;
	}

}