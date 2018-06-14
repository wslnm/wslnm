package com.wys.work.servermag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerQueryService {

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map);

}