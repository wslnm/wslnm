package com.wys.work.businessbillmag.queryservice.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.businessbillmag.queryservice.IBusinessBillQueryService;
import com.wys.work.businessbillmag.queryrepository.IBusinessBillQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Service
public class BusinessBillQueryServiceImpl implements IBusinessBillQueryService {

	private IBusinessBillQueryRepository businessBillQueryRepositoryImpl;

	/**
	 * 
	 * @param map
	 */
	public Pager findBusinessBill2Pager(Map map){
		return businessBillQueryRepositoryImpl.findBusinessBill2Pager(map);
	}

}