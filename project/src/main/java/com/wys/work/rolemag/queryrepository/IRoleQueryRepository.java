package com.wys.work.rolemag.queryrepository;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IRoleQueryRepository {

	/**
	 * 
	 * @param map
	 */
	public Pager findRole2Pager(Map map,Pager pager);

}