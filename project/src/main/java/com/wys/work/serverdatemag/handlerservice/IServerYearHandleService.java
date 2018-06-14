package com.wys.work.serverdatemag.handlerservice;

import com.wys.work.beans.ServerYearBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerYearHandleService {

	/**
	 * 
	 * @param serverYear
	 */
	public void deleteServerYear(ServerYearBean serverYear);

	/**
	 * 
	 * @param serverYear
	 */
	public void saveServerYear(ServerYearBean serverYear);

	/**
	 * 
	 * @param serverYear
	 */
	public void updateServerYear(ServerYearBean serverYear);

}