package com.wys.work.loginlogmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.LoginLogBean;
import com.wys.work.loginlogmag.handlerepository.ILoginLogHandleRepository;
import com.wys.work.loginlogmag.handleservice.ILoginLogHandleService;
@Service
public class LoginLogHandleServiceImpl implements ILoginLogHandleService {
	
	@Resource
	public ILoginLogHandleRepository iLoginLogHandleRepository;
	@Override
	public void saveLoginLog(LoginLogBean loginlog) {
		// TODO Auto-generated method stub
		iLoginLogHandleRepository.save(loginlog);
	}

}
