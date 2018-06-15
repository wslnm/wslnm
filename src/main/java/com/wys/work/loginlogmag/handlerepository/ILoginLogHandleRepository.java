package com.wys.work.loginlogmag.handlerepository;

import com.wys.work.beans.LoginLogBean;

public interface ILoginLogHandleRepository {
	/**
	 * 登录成功时，将存储日志信息
	 * /退出时，存储日志信息
	 * @param loginlog
	 * @return
	 */
	public void saveLoginLog(LoginLogBean loginlog);

}
