package com.wys.work.servermag.queryrepository;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerQueryRepository {

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map);
	
	public List<ServerBean> findAllServers();

}