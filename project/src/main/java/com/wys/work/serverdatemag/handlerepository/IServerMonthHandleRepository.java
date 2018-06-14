package com.wys.work.serverdatemag.handlerepository;

import com.wys.work.beans.ServerMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerMonthHandleRepository {

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