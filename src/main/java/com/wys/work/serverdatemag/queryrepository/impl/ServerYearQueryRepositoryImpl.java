package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerYearBean;
import com.wys.work.serverdatemag.queryrepository.IServerYearQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerYearMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Repository
public class ServerYearQueryRepositoryImpl implements IServerYearQueryRepository {

	@Resource
	public ServerYearMapper serverYearMapper;


	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerYear2Pager(Pager pager, Map parmas){
		int totalNums = serverYearMapper.findServerYear2Count(pager, parmas);
		pager.setTotalRows(totalNums);
		List<ServerYearBean> list = serverYearMapper.findServerYear2List(pager, parmas);
		pager.setDatas(list);
		return pager;
	}


	@Override
	public ServerYearBean findServerYearByYear(int year) {
		// TODO Auto-generated method stub
		return serverYearMapper.findServerYearByYear(year);
	}

}