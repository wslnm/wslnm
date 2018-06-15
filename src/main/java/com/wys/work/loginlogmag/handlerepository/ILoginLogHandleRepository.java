package com.wys.work.loginlogmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.LoginLogBean;

public interface ILoginLogHandleRepository extends JpaRepository<LoginLogBean, Long>,JpaSpecificationExecutor<LoginLogBean>{
	/**
	 * 登录成功时，将存储日志信息
	 * /退出时，存储日志信息
	 * @param loginlog
	 * @return
	 */
	

}
