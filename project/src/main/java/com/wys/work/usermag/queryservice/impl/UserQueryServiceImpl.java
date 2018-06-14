package com.wys.work.usermag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.usermag.queryservice.IUserQueryService;
import com.wys.work.usermag.queryrepository.IUserQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public class UserQueryServiceImpl implements IUserQueryService {

	public IUserQueryRepository m_IUserQueryRepository;

	public UserQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findUserBean2Pager(Pager pager, Map parmas){
		return null;
	}

}