package com.wys.work.accountingbillmag.queryrepository.impl;


import com.wys.work.accountingbillmag.mapper.AccountingBillMonthMapper;
import com.wys.work.accountingbillmag.queryrepository.IAccountingMonthQueryRepository;
import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.Pager;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

 

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
@Repository
public class AccountingBillQueryRepositoryMonthImpl implements IAccountingMonthQueryRepository {

	@Resource
	public AccountingBillMonthMapper accountingBillMapper;


	/**
	 * 
	 * @param map
	 */
	public Pager findAccountingBillMonth2Pager(Map map){
		Pager pager = (Pager) map.get("pager");
		
		map.put("index", pager.getIndex());
		map.put("rows", pager.getRows());
		int rows = accountingBillMapper.findAccounting2Count(map);
		pager.setTotalRows(rows);
		
		List<AccountingBillMonthBean> list = accountingBillMapper.findAccounting2List(map);
		pager.setDatas(list);
		return pager;
	}


	@Override
	public AccountingBillMonthBean findOne(String useracc) {
		// TODO 自动生成的方法存根
		return accountingBillMapper.findOne(useracc);
	}


}