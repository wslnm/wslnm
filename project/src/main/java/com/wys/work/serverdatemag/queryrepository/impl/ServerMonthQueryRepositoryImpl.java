package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryrepository.IServerMonthQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerMonthMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerMonthQueryRepositoryImpl implements IServerMonthQueryRepository {

	public ServerMonthMapper m_ServerMonthMapper;

	public ServerMonthQueryRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerMonth2Pager(Pager pager, Map parmas){
		return null;
	}

}