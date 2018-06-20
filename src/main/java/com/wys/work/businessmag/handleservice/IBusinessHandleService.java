package com.wys.work.businessmag.handleservice;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.AdminBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessHandleService {

	/**
	 * 
	 * @param business
	 */
	public void deleteBusiness(BusinessBean business);

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