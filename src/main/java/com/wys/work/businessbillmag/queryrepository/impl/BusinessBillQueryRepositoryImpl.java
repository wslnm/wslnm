package com.wys.work.businessbillmag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.businessbillmag.queryrepository.IBusinessBillQueryRepository;
import com.wys.work.businessbillmag.mapper.BusinessMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public class BusinessBillQueryRepositoryImpl implements IBusinessBillQueryRepository {

	public BusinessMapper m_BusinessMapper;

	public BusinessBillQueryRepositoryImpl(){

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