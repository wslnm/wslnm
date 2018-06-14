package com.wys.work.accountingbillmag.handleservice;

import com.wys.work.beans.AccountingBillMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAcccountingBillHandleMonthService {

	/**
	 * 
	 * @param accounting
	 */
	public void deleteAccountingBillMonth(AccountingBillMonthBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void saveAccountingBillMonth(AccountingBillMonthBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void updateAccountingBillMonth(AccountingBillMonthBean accounting);

}