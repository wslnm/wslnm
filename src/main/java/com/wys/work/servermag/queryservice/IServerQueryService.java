package com.wys.work.servermag.queryservice;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.BusinessBillBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerQueryService {

	/**
	 * 
	 * @param map
	 */
	public Pager findServer2Pager(Map map);
	
	public List<ServerBean> findAllServers();
	
	public boolean findServerBeanByAcc(String acc);
	
	public Pager findUser2Pager(Pager pager);
	
	public List<AccountingBillMonthBean> findBillsByYearAndAcc(String acc,int year);
	
	public List<BusinessBillBean> findBusinessBillBeanByAccs(String userAcc,int year,String osAcc);
	
	public List findAllBusinessAcc(String userAcc,int year);
	

}