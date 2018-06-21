package com.wys.work.serverdatemag.handlerservice;

import com.wys.work.beans.ServerDayBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerDayHandleService {

	/**
	 * 
	 * @param serverDay
	 */
	public void deleteServerDay(ServerDayBean serverDay);
	

	public void deleteAllserverDay();

	/**
	 * 
	 * @param serverDay
	 */
	public void saveServerDay(ServerDayBean serverDay);

	/**
	 * 
	 * @param serverDay
	 */
	public void updateServerDay(ServerDayBean serverDay);

}