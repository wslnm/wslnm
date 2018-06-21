package com.wys.work.serverdatemag.queryrepository;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerMonthQueryRepository {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerMonth2Pager(Pager pager, Map parmas);
	
	public ServerMonthBean findServerMonthByMonth(int month);
	
	public List<ServerMonthBean> findAllServerMonth();
	
	public int findServerYearTotalTimeByYear(int year);

}