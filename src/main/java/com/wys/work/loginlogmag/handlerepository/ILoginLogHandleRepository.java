package com.wys.work.loginlogmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wys.work.beans.LoginLogBean;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志持久层操作接口
 */
public interface ILoginLogHandleRepository extends JpaRepository<LoginLogBean, Long>{

}