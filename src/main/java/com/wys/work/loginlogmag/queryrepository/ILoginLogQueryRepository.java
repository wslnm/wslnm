package com.wys.work.loginlogmag.queryrepository;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.LoginLogBean;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志持久层查询接口
 */
public interface ILoginLogQueryRepository {

	/**
	 * 根据参数查询登陆日志总数
	 * @param params 页面参数
	 * @return 返回登陆日志总数
	 */
	public int countLoginLogByParams(Map params);
	
	/**
	 * 根据参数查询登陆日志集合
	 * @param params 页面参数
	 * @return 返回分页的登陆日志集合
	 */
	public List<LoginLogBean> findLoginLogByParams(Map params);

}