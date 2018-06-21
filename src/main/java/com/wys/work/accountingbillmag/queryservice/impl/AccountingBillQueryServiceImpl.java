package com.wys.work.accountingbillmag.queryservice.impl;

import com.wys.work.accountingbillmag.handlerepository.IAccountingBillHandleYearRepository;
import com.wys.work.accountingbillmag.queryrepository.IAccountingMonthQueryRepository;
import com.wys.work.accountingbillmag.queryservice.IAccountingBillQueryMonthService;
import com.wys.work.beans.Pager;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

 

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
@Service
public class AccountingBillQueryServiceImpl implements IAccountingBillQueryMonthService {

	@Resource
	public IAccountingMonthQueryRepository accountingMonthQueryRepositoryImpl;

	/**
	 * 
	 * @param map
	 */
	public Pager findAcccountingBill2Pager(Map map){
		return accountingMonthQueryRepositoryImpl.findAccountingBillMonth2Pager(map);
	}

}