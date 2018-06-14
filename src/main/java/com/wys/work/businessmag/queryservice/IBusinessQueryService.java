package com.wys.work.businessmag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessQueryService {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findBusiness2Pager(Pager pager, Map parmas);

}