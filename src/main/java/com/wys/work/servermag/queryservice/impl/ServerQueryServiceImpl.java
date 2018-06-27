package com.wys.work.servermag.queryservice.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.BusinessBillBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;
import com.wys.work.servermag.queryrepository.IServerQueryRepository;
import com.wys.work.servermag.queryservice.IServerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerQueryServiceImpl implements IServerQueryService {

	@Resource
	public IServerQueryRepository serverQueryRepositoryImpl;

	

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map){
		//public Pager findServers2Pager;

		return null;
	}
	
	public List<ServerBean> findAllServers(){
		return serverQueryRepositoryImpl.findAllServers();
	}

	@Override
	public boolean findServerBeanByAcc(String acc) {
		// TODO Auto-generated method stub
		return serverQueryRepositoryImpl.findServerBeanByAcc(acc);
	}

	@Override
	public Pager findUser2Pager(Pager pager) {
		// TODO Auto-generated method stub
		return serverQueryRepositoryImpl.findUser2Pager(pager);
	}

	@Override
	public List<AccountingBillMonthBean> findBillsByYearAndAcc(String acc, int year) {
		// TODO Auto-generated method stub
		return serverQueryRepositoryImpl.findBillsByYearAndAcc(acc, year);
	}

	

	@Override
	public List findAllBusinessAcc(String userAcc, int year) {
		// TODO Auto-generated method stub
		return serverQueryRepositoryImpl.findAllBusinessAcc(userAcc, year);
	}

	@Override
	public List<BusinessBillBean> findBusinessBillBeanByAccs(String userAcc, int year, String osAcc) {
		// TODO Auto-generated method stub
		return serverQueryRepositoryImpl.findBusinessBillBeanByAccs(userAcc, year, osAcc);
	}
	

	
	
	

}