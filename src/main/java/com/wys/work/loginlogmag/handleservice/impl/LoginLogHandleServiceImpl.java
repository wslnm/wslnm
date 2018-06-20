package com.wys.work.loginlogmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.LoginLogBean;
import com.wys.work.loginlogmag.handleservice.ILoginLogHandleService;
import com.wys.work.loginlogmag.handlerepository.ILoginLogHandleRepository;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志业务类
 */
@Service
public class LoginLogHandleServiceImpl implements ILoginLogHandleService {

	@Resource
	public ILoginLogHandleRepository loginLogHandleRepositoryImpl;

	/**
	 * 新增登陆日志
	 * @param loginLog
	 */
	public void saveLoginLog(LoginLogBean loginLog){
		loginLogHandleRepositoryImpl.save(loginLog);
	}

}