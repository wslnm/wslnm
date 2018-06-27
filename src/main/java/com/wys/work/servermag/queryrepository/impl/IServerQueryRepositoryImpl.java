package com.wys.work.servermag.queryrepository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.jpa.criteria.predicate.IsEmptyPredicate;
import org.springframework.stereotype.Repository;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.BusinessBillBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;
import com.wys.work.beans.UserBean;
import com.wys.work.servermag.queryrepository.IServerQueryRepository;
import com.wys.work.servermag.mapper.ServerMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
@Repository
public class IServerQueryRepositoryImpl implements IServerQueryRepository {

	@Resource
	public ServerMapper serverMapper;


	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map){
		return null;
	}
	
	public List<ServerBean> findAllServers(){
		return serverMapper.findAllServers();
		
	}

	@Override
	public boolean findServerBeanByAcc(String acc) {
		// TODO Auto-generated method stub
		List<ServerBean> list=serverMapper.findServerBeanByAcc(acc);
//		System.out.println(lsit);
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	
	}

	@Override
	public Pager findUser2Pager(Pager pager) {
		// TODO Auto-generated method stub
	
		int totalNum=serverMapper.findUser2Count();
		pager.setTotalRows(totalNum);
		List<UserBean> list=serverMapper.findUser2List(pager);
		pager.setDatas(list);
		return pager;
	}

	@Override
	public List<AccountingBillMonthBean> findBillsByYearAndAcc(String acc, int year) {
		// TODO Auto-generated method stub
		List<AccountingBillMonthBean> list=serverMapper.findBillsByYearAndAcc(acc, year);
		int n=12-list.size();
		if(list.size()<12) {
			for (int i = 0; i < n; i++) {
				AccountingBillMonthBean accBillMonth=new AccountingBillMonthBean();
				list.add(accBillMonth);
			}
		}
		
		for (int i = 0; i <12; i++) {
			if(list.get(i).getAccountingBillMonth()!=(i+1)) {
				
				list.add(i+1, list.get(i));
				
				AccountingBillMonthBean accBill=new AccountingBillMonthBean();
				accBill.setAccountingBillMonth(i+1);
				list.add(i,accBill);
				}
		
	}
		return list;
	}



	@Override
	public List findAllBusinessAcc(String userAcc, int year) {
		// TODO Auto-generated method stub
		return serverMapper.findAllBusinessAcc(userAcc, year);
	}

	

	@Override
	public List<BusinessBillBean> findBusinessBillBeanByAccs(String userAcc, int year, String osAcc) {
		// TODO Auto-generated method stub
		
		List<BusinessBillBean> list=serverMapper.findBusinessBillBeanByAccs(userAcc, year, osAcc);
		int n=12-list.size();
		if(list.size()<12) {
			for (int i = 0; i < n; i++) {
				BusinessBillBean businessBillBean=new BusinessBillBean();
				list.add(businessBillBean);
			}
		}
		
		for (int i = 0; i <12; i++) {
			if(list.get(i).getMonth()!=(i+1)) {
				
				list.add(i+1, list.get(i));
				
				BusinessBillBean businessBillBean=new BusinessBillBean();
				businessBillBean.setMonth(i+1);
				list.add(i,businessBillBean);
				}
		
	}
		
		
		return list;
	}

}