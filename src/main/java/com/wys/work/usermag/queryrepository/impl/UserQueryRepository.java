package com.wys.work.usermag.queryrepository.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;
import com.wys.work.usermag.queryrepository.IUserQueryRepository;
import com.wys.work.usermag.mapper.UserMapper;

/**
 * �û���ѯ�ĳ־ò� impl
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Repository
public class UserQueryRepository implements IUserQueryRepository {

	@Resource
	public UserMapper userMapper;


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
		return userMapper.login(userAcc, userPwd);
		
	}

}