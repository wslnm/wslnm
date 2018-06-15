package com.wys.work.tariffmag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface ITariffQueryService {

	/**
	 * 
	 * @param params
	 * @param pager
	 */
	public Pager findTariffBean2Pager(Pager pager);

}