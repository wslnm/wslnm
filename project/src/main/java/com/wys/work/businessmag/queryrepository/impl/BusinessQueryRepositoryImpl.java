package com.wys.work.businessmag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.businessmag.queryrepository.IBusinessQueryRepository;
import com.wys.work.businessmag.mapper.BusinessMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public class BusinessQueryRepositoryImpl implements IBusinessQueryRepository {

	public BusinessMapper m_BusinessMapper;

	public BusinessQueryRepositoryImpl(){

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