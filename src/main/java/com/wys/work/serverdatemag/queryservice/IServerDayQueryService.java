package com.wys.work.serverdatemag.queryservice;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerDayQueryService {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerDay2Pager(Pager pager, Map parmas);
	
	public ServerDayBean findServerDayByDay(int day);
	
	public List<ServerDayBean> findAllServerDay();
	
	public int findServerMonthTotalTimeByMonth(int month,int year);
	

}