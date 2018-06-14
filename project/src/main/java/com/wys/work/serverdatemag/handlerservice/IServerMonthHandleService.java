package com.wys.work.serverdatemag.handlerservice;

import com.wys.work.beans.ServerMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerMonthHandleService {

	/**
	 * 
	 * @param serverMonth
	 */
	public void deleteServerMonth(ServerMonthBean serverMonth);

	/**
	 * 
	 * @param serverMonth
	 */
	public void saveServerMonth(ServerMonthBean serverMonth);

	/**
	 * 
	 * @param serverMonth
	 */
	public void updateServerMonth(ServerMonthBean serverMonth);

}