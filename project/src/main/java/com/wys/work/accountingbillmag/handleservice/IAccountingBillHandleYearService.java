package com.wys.work.accountingbillmag.handleservice;

import com.wys.work.beans.AccountingBillYearBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAccountingBillHandleYearService {

	/**
	 * 
	 * @param accounting
	 */
	public void deleteAccountingBillYear(AccountingBillYearBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void saveAccountingBillYear(AccountingBillYearBean accounting);

	/**
	 * 
	 * @param accounting
	 */
	public void updateAcccountingBillYear(AccountingBillYearBean accounting);

}