package com.wys.work.businessmag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.businessmag.queryservice.IBusinessQueryService;
import com.wys.work.businessmag.queryrepository.IBusinessQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public class BusinessQueryServiceImpl implements IBusinessQueryService {

	public IBusinessQueryRepository m_IBusinessQueryRepository;

	public BusinessQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findBusiness2Pager(Pager pager, Map parmas){
		return null;
	}

}