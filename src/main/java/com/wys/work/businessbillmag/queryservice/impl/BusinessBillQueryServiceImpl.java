package com.wys.work.businessbillmag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.businessbillmag.queryservice.IBusinessBillQueryService;
import com.wys.work.businessbillmag.queryrepository.IBusinessBillQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public class BusinessBillQueryServiceImpl implements IBusinessBillQueryService {

	public IBusinessBillQueryRepository m_IBusinessBillQueryRepository;

	public BusinessBillQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param map
	 */
	public Pager findBusinessBill2Pager(Map map){
		return null;
	}

}