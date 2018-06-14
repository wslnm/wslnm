package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerYearMapper {

	/**
	 * 
	 * @param parmas
	 */
	public long findServerYear2Count(Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	public List findServerYear2List(Map parmas);

}