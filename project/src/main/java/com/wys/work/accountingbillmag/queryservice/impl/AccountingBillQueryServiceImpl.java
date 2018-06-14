package com.wys.work.accountingbillmag.queryservice.impl;

import com.wys.work.accountingbillmag.handlerepository.IAccountingBillHandleYearRepository;
import com.wys.work.accountingbillmag.queryservice.IAccountingBillQueryMonthService;
import com.wys.work.beans.Pager;


import java.util.Map;



/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
public class AccountingBillQueryServiceImpl implements IAccountingBillQueryMonthService {

	public IAccountingBillHandleYearRepository m_IAccountingQueryRepository;

	public AccountingBillQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findAcccountingBill2Pager(Map map,Pager pager){
		return null;
	}

}