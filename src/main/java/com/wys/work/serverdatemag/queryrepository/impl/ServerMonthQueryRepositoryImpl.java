package com.wys.work.serverdatemag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;
import com.wys.work.beans.ServerMonthBean;
import com.wys.work.serverdatemag.queryrepository.IServerMonthQueryRepository;
import com.wys.work.serverdatemag.mapper.ServerMonthMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Repository
public class ServerMonthQueryRepositoryImpl implements IServerMonthQueryRepository {

	@Resource
	public ServerMonthMapper serverMonthMapper;

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findServerMonth2Pager(Pager pager, Map parmas) {
		int totalNums = serverMonthMapper.findServerMonth2Count(pager, parmas);
		pager.setTotalRows(totalNums);
		List<ServerMonthBean> list = serverMonthMapper.findServerMonth2List(pager, parmas);
		pager.setDatas(list);
		return pager;
	}

}