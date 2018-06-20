package com.wys.work.serverdatemag.handlerservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.ServerYearBean;
import com.wys.work.serverdatemag.handlerservice.IServerYearHandleService;
import com.wys.work.serverdatemag.handlerepository.IServerYearHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Service
public class ServerYearHandleServiceImpl implements IServerYearHandleService {

	@Resource
	public IServerYearHandleRepository serverYearHandleRepository;

	

	/**
	 * 
	 * @param serverYear
	 */
	public void deleteServerYear(ServerYearBean serverYear){
		serverYearHandleRepository.delete(serverYear);
	}

	/**
	 * 
	 * @param serverYear
	 */
	public void saveServerYear(ServerYearBean serverYear){
		serverYearHandleRepository.save(serverYear);
	}

	/**
	 * 
	 * @param serverYear
	 */
	public void updateServerYear(ServerYearBean serverYear){
		serverYearHandleRepository.saveAndFlush(serverYear);
	}

}