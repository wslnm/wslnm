package com.wys.work.loginlogmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.LoginLogBean;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志mapper映射
 */

public interface LoginLogMapper {

	/**
	 * 根据参数查询登陆日志总数
	 * @param params 页面参数
	 * @return 返回登陆日志总数
	 */
	@SelectProvider(type=LoginLogMapperSqlProvider.class,method="countLoginLogByParams")
	public int countLoginLogByParams(@Param("params")Map params);
	
	/**
	 * 根据参数查询登陆日志集合
	 * @param params 页面参数
	 * @return 返回分页的登陆日志集合
	 */
	@Results({
			@Result(id=true,property="id",column="id",javaType=Long.class),
			@Result(property="adminName",column="admin_name",javaType=String.class),
			@Result(property="roleName",column="role_name",javaType=String.class),
			@Result(property="operation",column="operation",javaType=Integer.class),
			@Result(property="ip",column="ip",javaType=String.class),
			@Result(property="operationDate",column="operation_date",javaType=Date.class)
			
			
	})
	@SelectProvider(type=LoginLogMapperSqlProvider.class,method="findLoginLogByParams")
	public List<LoginLogBean> findLoginLogByParams(@Param("params")Map params);
}