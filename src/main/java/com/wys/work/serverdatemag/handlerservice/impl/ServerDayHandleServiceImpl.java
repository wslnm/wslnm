package com.wys.work.serverdatemag.handlerservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.ServerDayBean;
import com.wys.work.serverdatemag.handlerservice.IServerDayHandleService;
import com.wys.work.serverdatemag.handlerepository.IServerDayHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
@Service
public class ServerDayHandleServiceImpl implements IServerDayHandleService {

	@Resource
	public IServerDayHandleRepository serverDayHandleRepository;

	

	/**
	 * 
	 * @param serverDay
	 */
	public void deleteServerDay(ServerDayBean serverDay){

	}

	/**
	 * 
	 * @param serverDay
	 */
	public void saveServerDay(ServerDayBean serverDay){
		serverDayHandleRepository.save(serverDay);
	}

	/**
	 * 
	 * @param serverDay
	 */
	public void updateServerDay(ServerDayBean serverDay){

	}

}