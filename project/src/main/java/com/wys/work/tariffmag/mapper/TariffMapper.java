package com.wys.work.tariffmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public interface TariffMapper {

	/**
	 * 
	 * @param params
	 */
	public long findTariffBean2Count(Map params);

	/**
	 * 
	 * @param params
	 */
	public List findTariffBean2List(Map params);

}