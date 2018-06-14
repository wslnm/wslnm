package com.wys.work.servermag.handleservice;

import com.wys.work.beans.ServerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerHandleService {

	/**
	 * 
	 * @param server
	 */
	public int deleteServer(ServerBean server);

	/**
	 * 
	 * @param server
	 */
	public void saveServer(ServerBean server);

	/**
	 * 
	 * @param server
	 */
	public int updateServer(ServerBean server);

}