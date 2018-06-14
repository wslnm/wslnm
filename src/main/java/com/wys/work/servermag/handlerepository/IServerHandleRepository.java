package com.wys.work.servermag.handlerepository;

import com.wys.work.beans.ServerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerHandleRepository {

	/**
	 * 
	 * @param server
	 */
	public void deleteServer(ServerBean server);

	/**
	 * 
	 * @param server
	 */
	public void saveServer(ServerBean server);

	/**
	 * 
	 * @param server
	 */
	public void updateServer(ServerBean server);

}