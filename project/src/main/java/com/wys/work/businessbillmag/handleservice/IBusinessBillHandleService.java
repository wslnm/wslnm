package com.wys.work.businessbillmag.handleservice;

import com.wys.work.beans.BusinessBillBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessBillHandleService {

	/**
	 * 
	 * @param businessBill
	 */
	public void deleteBusinessBill(BusinessBillBean businessBill);

	/**
	 * 
	 * @param businessBill
	 */
	public void saveBusinessBill(BusinessBillBean businessBill);

	/**
	 * 
	 * @param businessBill
	 */
	public void updateBusinessBill(BusinessBillBean businessBill);

}