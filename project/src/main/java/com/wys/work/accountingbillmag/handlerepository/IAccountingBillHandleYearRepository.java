package com.wys.work.accountingbillmag.handlerepository;

import com.wys.work.beans.AccountingBillYearBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAccountingBillHandleYearRepository {

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
	public void updateAccountingBILLyEAR(AccountingBillYearBean accounting);

}