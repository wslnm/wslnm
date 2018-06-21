package com.wys.work.servermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.jboss.logging.annotations.Param;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerMapper {

	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="info",column="server_info"),
		@Result(property="loginTime",column="server_login_time"),
		@Result(property="exitTime",column="server_exit_time"),
		@Result(property="duration",column="server_duration"),
		@Result(property="acc",column="login_acc")
	})
	@Select(value= {"select * from t_server"})
	public List<ServerBean> findAllServers();
	
	

}