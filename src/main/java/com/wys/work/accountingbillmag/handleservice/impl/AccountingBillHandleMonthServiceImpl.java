package com.wys.work.accountingbillmag.handleservice.impl;

import com.wys.work.beans.AccountingBillMonthBean;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.accountingbillmag.handlerepository.IAcountingBillMonthRepository;
import com.wys.work.accountingbillmag.handleservice.IAcccountingBillHandleMonthService;


/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
@Service
public class AccountingBillHandleMonthServiceImpl implements IAcccountingBillHandleMonthService {

	@Resource
	public IAcountingBillMonthRepository acountingBillRepositoryImpl;


	/**
	 * 
	 * @param accounting
	 */
	public void deleteAccountingBillMonth(AccountingBillMonthBean accounting){
		acountingBillRepositoryImpl.delete(accounting);
	}

	/**
	 * 
	 * @param accounting
	 */
	public void saveAccountingBillMonth(AccountingBillMonthBean accounting){
		acountingBillRepositoryImpl.save(accounting);
	}

	/**
	 * 
	 * @param accounting
	 */
	public void updateAccountingBillMonth(AccountingBillMonthBean accounting){
		acountingBillRepositoryImpl.saveAndFlush(accounting);
	}

}