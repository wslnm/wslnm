package com.wys.work.loginlogmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.LoginLogBean;
import com.wys.work.loginlogmag.mapper.LoginLogMapper;
import com.wys.work.loginlogmag.queryrepository.ILoginLogQueryRepository;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志持久层查询类
 */
@Repository
public class LoginLogQueryRepositoryImpl implements ILoginLogQueryRepository {

	@Resource
	public LoginLogMapper loginLogMapper;

	/**
	 * 根据参数查询登陆日志总数
	 * @param params 页面参数
	 * @return 返回登陆日志总数
	 */
	public int countLoginLogByParams(Map params) {
		return loginLogMapper.countLoginLogByParams(params);
	}
	
	/**
	 * 根据参数查询登陆日志集合
	 * @param params 页面参数
	 * @return 返回分页的登陆日志集合
	 */
	public List<LoginLogBean> findLoginLogByParams(Map params){
		return loginLogMapper.findLoginLogByParams(params);
	}

}