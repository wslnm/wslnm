package com.wys.work.businessbillmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.Pager;
import com.wys.work.businessbillmag.queryrepository.IBusinessBillQueryRepository;
import com.wys.work.businessbillmag.mapper.BusinessbillMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Repository
public class BusinessBillQueryRepositoryImpl implements IBusinessBillQueryRepository {

	@Resource
	public BusinessbillMapper businessBillMapper;


	/**
	 * 
	 * @param map
	 */
	public Pager findBusinessBill2Pager(Map map){
		Pager pager = (Pager) map.get("pager");
		map.put("index", pager.getIndex());
		map.put("rows", pager.getRows());
		int rows = businessBillMapper.findBusiness2Count(map);
		pager.setTotalRows(rows);
		
		
		List<AccountingBillMonthBean> list = businessBillMapper.findBusiness2List(map);
		pager.setDatas(list);
		return pager;
	}

}