package com.wys.work.businessmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface BusinessMapper {

	/**
	 * 
	 * @param parmas
	 */
	public long findBusiness2Count(Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	public List findBusiness2List(Map parmas);

}