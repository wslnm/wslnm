package com.wys.work.rolemag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IRoleQueryService {

	/**
	 * 
	 * @param map
	 */
	public Pager findRole2Pager(Map map,Pager pager);

}