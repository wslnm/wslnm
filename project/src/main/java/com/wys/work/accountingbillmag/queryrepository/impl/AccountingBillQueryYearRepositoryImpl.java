package com.wys.work.accountingbillmag.queryrepository.impl;

import com.wys.work.beans.AccountingBillYearBean;
import com.wys.work.beans.Pager;

import java.util.Map;

import com.wys.work.accountingbillmag.controller.AccountingBillMonthController;
import com.wys.work.accountingbillmag.handlerepository.IAccountingBillHandleYearRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
public class AccountingBillQueryYearRepositoryImpl implements IAccountingBillHandleYearRepository {

	public AccountingBillMonthController m_AccountingBillYearMapper;

	public AccountingBillQueryYearRepositoryImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findAccountingBillYear2Pager(Map map,Pager pager){
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