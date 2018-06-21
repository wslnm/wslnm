package com.wys.work.servermag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;
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

	

}