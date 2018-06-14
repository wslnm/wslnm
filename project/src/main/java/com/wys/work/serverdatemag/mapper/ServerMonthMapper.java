package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerMonthMapper {

	/**
	 * 
	 * @param parmas
	 */
	public long findServerMonth2Count(Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	public List findServerMonth2List(Map parmas);

}