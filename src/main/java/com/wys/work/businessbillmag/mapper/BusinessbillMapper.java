package com.wys.work.businessbillmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface BusinessbillMapper {

	/**
	 * 
	 * @param map
	 */
	public int findBusiness2Count(Map map);

	/**
	 * 
	 * @param map
	 */
	public List findBusiness2List(Map map);
	
	

}