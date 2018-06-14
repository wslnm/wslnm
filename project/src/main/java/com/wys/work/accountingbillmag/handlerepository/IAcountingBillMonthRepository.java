package com.wys.work.accountingbillmag.handlerepository;

import com.wys.work.beans.AccountingBillMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAcountingBillMonthRepository {

	/**
	 * 
	 * @param accounting
	 */
	public void deleteAccountingMonth(AccountingBillMonthBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void saveAccountingMonth(AccountingBillMonthBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void updateAccountingMonth(AccountingBillMonthBean accounting);

}