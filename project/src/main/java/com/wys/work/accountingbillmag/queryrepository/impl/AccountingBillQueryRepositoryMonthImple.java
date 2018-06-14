package com.wys.work.accountingbillmag.queryrepository.impl;

import com.wys.work.accountingbillmag.handlerepository.IAccountingBillHandleYearRepository;
import com.wys.work.accountingbillmag.mapper.AccountingBillMonthMapper;
import com.wys.work.beans.AccountingBillYearBean;
import com.wys.work.beans.Pager;


import java.util.Map;



/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
public class AccountingBillQueryRepositoryMonthImple implements IAccountingBillHandleYearRepository {

	public AccountingBillMonthMapper m_AccountingBillMapper;

	public AccountingBillQueryRepositoryMonthImple(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findAccountingBillMonth2Pager(Map map,Pager pager){
		return null;
	}

	public void deleteAccountingBillYear(AccountingBillYearBean accounting) {
		// TODO Auto-generated method stub
		
	}

	public void saveAccountingBillYear(AccountingBillYearBean accounting) {
		// TODO Auto-generated method stub
		
	}

	public void updateAccountingBILLyEAR(AccountingBillYearBean accounting) {
		// TODO Auto-generated method stub
		
	}

}