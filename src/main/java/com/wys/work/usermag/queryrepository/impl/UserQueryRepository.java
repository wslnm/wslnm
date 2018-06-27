package com.wys.work.usermag.queryrepository.impl;

import java.util.List;
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


	@Override
	public Pager findUserBean2Pager(Pager pager, Map parmas){
		Long a = userMapper.findUserBean2Count(parmas);
		int totalRows = a.intValue();
		List<UserBean> datas = userMapper.findUserBean2List(parmas, pager);
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		
		return pager;
	}

	@Override
	public UserBean login(String userAcc, String userPwd) {
		// TODO Auto-generated method stub
		return userMapper.login(userAcc, userPwd);
		
	}

}