package com.wys.work.servermag.queryservice.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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
	

	
	
	

}