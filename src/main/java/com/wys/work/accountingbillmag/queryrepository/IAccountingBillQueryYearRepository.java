package com.wys.work.accountingbillmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAccountingBillQueryYearRepository {

	/**
	 * 
	 * @param map
	 */
	public Pager findAccountingBillYear2Pager(Map map,Pager pager);

}