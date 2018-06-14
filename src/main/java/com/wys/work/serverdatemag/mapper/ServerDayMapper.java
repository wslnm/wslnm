package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface ServerDayMapper {

	/**
	 * 
	 * @param parmas
	 */
	public long findServerDay2Count(Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	public List findServerDay2List(Map parmas);

}