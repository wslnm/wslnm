package com.wys.work.loginlogmag.handleservice;

import com.wys.work.beans.LoginLogBean;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志操作接口
 */
public interface ILoginLogHandleService {

	/**
	 * 新增登陆日志
	 * @param loginLog 
	 */
	public void saveLoginLog(LoginLogBean loginLog);

}