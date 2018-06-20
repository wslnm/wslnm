package com.wys.work.serverdatemag.handlerservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.ServerMonthBean;
import com.wys.work.serverdatemag.handlerepository.IServerMonthHandleRepository;
import com.wys.work.serverdatemag.handlerservice.IServerMonthHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerMonthHandleServiceImpl implements IServerMonthHandleService {

	@Resource
	public IServerMonthHandleRepository serverMonthHandleRepository;

	
	/**
	 * 
	 * @param serverMonth
	 */
	public void deleteServerMonth(ServerMonthBean serverMonth){
		serverMonthHandleRepository.delete(serverMonth);
	}

	/**
	 * 
	 * @param serverMonth
	 */
	public void saveServerMonth(ServerMonthBean serverMonth){
		serverMonthHandleRepository.save(serverMonth);
	}

	/**
	 * 
	 * @param serverMonth
	 */
	public void updateServerMonth(ServerMonthBean serverMonth){
		serverMonthHandleRepository.saveAndFlush(serverMonth);
	}

}