package com.wys.work.usermag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;
import com.wys.work.usermag.queryservice.IUserQueryService;
import com.wys.work.usermag.queryrepository.IUserQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Service
public class UserQueryServiceImpl implements IUserQueryService {

	@Resource
	public IUserQueryRepository userQueryRepositoryImpl;


	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findUserBean2Pager(Pager pager, Map parmas){
		return null;
	}

	@Override
	public UserBean login(String userAcc, String userPwd) {
		// TODO Auto-generated method stub
		return userQueryRepositoryImpl.login(userAcc, userPwd);
	}

}