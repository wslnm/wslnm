package com.wys.work.businessmag.handlerepository;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.AdminBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessHandleRepository {

	/**
	 * 
	 * @param business
	 */
	public void delete(BusinessBean business);

	/**
	 * 
	 * @param business
	 */
	public void saveBusiness(BusinessBean business);

	/**
	 * 
	 * @param business
	 */
	public void updateBusiness(BusinessBean business);

}