package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;
import com.wys.work.serverdatemag.queryrepository.IServerDayQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerDayMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Repository
public class ServerDayQueryRepositoryImpl implements IServerDayQueryRepository {


	@Resource
	public ServerDayMapper serverDayMapper;


	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerDay2Pager(Pager pager, Map params){
		
		int totalNums=serverDayMapper.findServerDay2Count(pager, params);
		pager.setTotalRows(totalNums);
		List<ServerDayBean> list=serverDayMapper.findServerDay2List(pager, params);
		pager.setDatas(list);
		return pager;
	}

}