package com.wys.work.servermag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerMapper {

	/**
	 * 
	 * @param map
	 */
	public int findServer2Count(Map map);

	/**
	 * 
	 * @param map
	 */
	public List findServer2List(Map map);

}