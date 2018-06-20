package com.wys.work.loginlogmag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志业务查询接口
 */
public interface ILoginLogQueryService {

	/**
	 * 根据参数分页查询登陆日志
	 * @param params
	 */
	public Pager findLoginLogByParams2Pager(Map params,Pager pager);

}