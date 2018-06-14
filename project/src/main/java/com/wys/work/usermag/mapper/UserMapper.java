package com.wys.work.usermag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public interface UserMapper {

	/**
	 * 
	 * @param params
	 */
	public long findUserBean2Count(Map params);

	/**
	 * 
	 * @param params
	 */
	public List findUserBean2List(Map params);

}