package com.wys.work.serverdatemag.queryrepository;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerMonthBean;
import com.wys.work.beans.ServerYearBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerYearQueryRepository {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pager(Pager pager, Map parmas);
	
	public ServerYearBean findServerYearByYear(int year);

}