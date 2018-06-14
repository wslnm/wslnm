package com.wys.work.usermag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

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

}