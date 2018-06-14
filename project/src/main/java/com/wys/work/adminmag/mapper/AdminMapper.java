package com.wys.work.adminmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface AdminMapper {

	/**
	 * 
	 * @param parmas
	 */
	public long findAdmin2Count(Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	public List findAdmin2List(Map parmas);

}