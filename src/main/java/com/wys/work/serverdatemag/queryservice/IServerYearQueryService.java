package com.wys.work.serverdatemag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerYearQueryService {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pgaer(Pager pager, Map parmas);

}