package com.wys.work.serverdatemag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryrepository.IServerMonthQueryRepository;
import com.wys.work.serverdatemag.queryservice.IServerMonthQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerMonthQueryServiceImpl implements IServerMonthQueryService {

	public IServerMonthQueryRepository m_IServerMonthQueryRepository;

	public ServerMonthQueryServiceImpl(){

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