package com.wys.work.accountingbillmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.AccountingBillMonthBean;


/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
public interface AccountingBillMonthMapper {

	/**
	 * 
	 * @param map
	 */
	public int findAccounting2Count(Map map);

	/**
	 * 
	 * @param map
	 */
	public List findAccounting2List(Map map);
	
	public AccountingBillMonthBean findOne(String useracc);

}