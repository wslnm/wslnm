package com.wys.work.serverdatemag.queryservice.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;
import com.wys.work.serverdatemag.queryservice.IServerDayQueryService;
import com.wys.work.serverdatemag.queryrepository.IServerDayQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerDayQueryServiceImpl implements IServerDayQueryService {

	@Resource
	public IServerDayQueryRepository serverDayQueryRepositoryImpl;

	

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerDay2Pager(Pager pager, Map parmas){
		return serverDayQueryRepositoryImpl.findServerDay2Pager(pager, parmas);
	}



	@Override
	public ServerDayBean findServerDayByDay(int day) {
		// TODO Auto-generated method stub
		return serverDayQueryRepositoryImpl.findServerDayByDay(day);
	}



	@Override
	public List<ServerDayBean> findAllServerDay() {
		// TODO Auto-generated method stub
		return serverDayQueryRepositoryImpl.findAllServerDay();
	}



	@Override
	public int findServerMonthTotalTimeByMonth(int month,int year) {
		// TODO Auto-generated method stub
		return serverDayQueryRepositoryImpl.findServerMonthTotalTimeByMonth(month, year);
	}

}