package com.wys.work.serverdatemag.queryrepository;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerDayQueryRepository {

	/**
	 *  通过传入两个参数 查询出日服务用户的分页对象
	 * @param pager 传入的分页对象
	 * @param parmas map集合，传入查询的条件
	 */
	public Pager findServerDay2Pager(Pager pager, Map params);

	public ServerDayBean findServerDayByDay(int day);
	
	public List<ServerDayBean> findAllServerDay();
	
	public int findServerMonthTotalTimeByMonth(int month,int year);
}