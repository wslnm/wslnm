package com.wys.work.serverdatemag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryservice.IServerYearQueryService;
import com.wys.work.serverdatemag.queryrepository.IServerYearQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public class ServerYearQueryServiceImpl implements IServerYearQueryService {

	public IServerYearQueryRepository m_IServerYearQueryRepository;

	public ServerYearQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pgaer(Pager pager, Map parmas){
		return null;
	}

}