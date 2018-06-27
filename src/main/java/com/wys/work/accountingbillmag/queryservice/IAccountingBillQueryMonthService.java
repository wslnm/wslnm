package com.wys.work.accountingbillmag.queryservice;

import java.util.Map;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAccountingBillQueryMonthService {

	/**
	 * 
	 * @param map
	 */
	public Pager findAcccountingBill2Pager(Map map);

	public AccountingBillMonthBean findOne(String useracc);
}