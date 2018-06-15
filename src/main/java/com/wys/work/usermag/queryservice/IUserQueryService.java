package com.wys.work.usermag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;

/**
 * �û���� ��ѯ  ҵ���
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface IUserQueryService {

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findUserBean2Pager(Pager pager, Map parmas);
	
	/**
	 * 登录前判断是否有此账号和密码的用户
	 * @param userAcc
	 * @param userPwd
	 * @return 返回一个封装好所有用户信息的UserBean对象
	 */
	public UserBean login(String userAcc,String userPwd);


}