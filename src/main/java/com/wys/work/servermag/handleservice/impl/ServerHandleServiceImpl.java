package com.wys.work.servermag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.ServerBean;
import com.wys.work.servermag.handleservice.IServerHandleService;
import com.wys.work.servermag.handlerepository.IServerHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerHandleServiceImpl implements IServerHandleService {

	@Resource
	public IServerHandleRepository serverHandleRepository;
	
	/**
	 * 
	 * @param server
	 */
	public int deleteServer(ServerBean server){
		//public void delete Server;

		return 0;
	}

	/**
	 * 
	 * @param server
	 */
	public void saveServer(ServerBean server){
		//public void saveServer;


	}

	/**
	 * 
	 * @param server
	 */
	public int updateServer(ServerBean server){
		//public void updateServer;

		return 0;
	}

}