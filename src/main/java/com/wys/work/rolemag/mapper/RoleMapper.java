package com.wys.work.rolemag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface RoleMapper {

	/**
	 * 
	 * @param map
	 */
	public int findRole2Count(Map map);

	/**
	 * 
	 * @param map
	 */
	public List findRole2List(Map map);

}