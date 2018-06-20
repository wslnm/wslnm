package com.wys.work.loginlogmag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.loginlogmag.queryrepository.ILoginLogQueryRepository;
import com.wys.work.loginlogmag.queryservice.ILoginLogQueryService;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志业务查询类
 */
@Service
public class LoginLogQueryServiceImpl implements ILoginLogQueryService {

	@Resource
	public ILoginLogQueryRepository loginLogQueryRepositoryImpl;

	/**
	 * 根据参数分页查询登录日志
	 * @param params 查询参数
	 * @param pager 分页参数
	 * @return 分页对象
	 */
	public Pager findLoginLogByParams2Pager(Map params,Pager pager){
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(loginLogQueryRepositoryImpl.findLoginLogByParams(params));
		pager.setTotalRows(loginLogQueryRepositoryImpl.countLoginLogByParams(params));
		return pager;
	}

}