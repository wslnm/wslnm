package com.wys.work.usermag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.usermag.queryrepository.IUserQueryRepository;
import com.wys.work.usermag.mapper.UserMapper;

/**
 * �û���ѯ�ĳ־ò� impl
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public class UserQueryRepository implements IUserQueryRepository {

	public UserMapper m_UserMapper;

	public UserQueryRepository(){

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