package com.wys.work.serverdatemag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryrepository.IServerMonthQueryRepository;
import com.wys.work.serverdatemag.queryservice.IServerMonthQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerMonthQueryServiceImpl implements IServerMonthQueryService {

	@Resource
	public IServerMonthQueryRepository serverMonthQueryRepositoryImpl;


	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerMonth2Pager(Pager pager, Map parmas){
		return serverMonthQueryRepositoryImpl.findServerMonth2Pager(pager, parmas);
	}

}