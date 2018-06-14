package com.wys.work.businessbillmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessBillQueryRepository {

	/**
	 * 
	 * @param map
	 */
	public Pager findBusinessBill2Pager(Map map);

}