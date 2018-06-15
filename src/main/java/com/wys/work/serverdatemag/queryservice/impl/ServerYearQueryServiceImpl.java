package com.wys.work.serverdatemag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.queryservice.IServerYearQueryService;
import com.wys.work.serverdatemag.queryrepository.IServerYearQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerYearQueryServiceImpl implements IServerYearQueryService {

	@Resource
	public IServerYearQueryRepository serverYearQueryRepositoryImpl;

	

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pgaer(Pager pager, Map parmas){
		return serverYearQueryRepositoryImpl.findServerYear2Pager(pager, parmas);
	}

}