package com.wys.work.operationlogmag.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.OperationLogBean;

/**
 * @author lyd
 * @version 1.0
 * 操作日志mapper
 */
public interface OperationLogMapper {

	/**
	 * 根据参数查询操作日志总数
	 * 
	 * @param params
	 *            查询参数
	 * @return 操作日志总数
	 */
	@SelectProvider(type = OperationLogMapperSqlProvider.class, method = "countOperationLogByParams")
	public int countOperationLogByParams(@Param("params")Map params);

	/**
	 * 根据参数查询登陆日志集合
	 * 
	 * @param params
	 *            查询参数
	 * @return 返回分页的登陆日志集合
	 */
	@Results({ @Result(id = true, property = "id", column = "id", javaType = Long.class),
			@Result(property = "roleName", column = "role_name", javaType = Integer.class),
			@Result(property = "operationDate", column = "operation_date", javaType = Date.class),
			@Result(property = "operation", column = "operation", javaType = String.class),
			@Result(property = "systemMod", column = "system_mod", javaType = Integer.class),
			@Result(property = "adminName", column = "admin_name", javaType = String.class) })
	@SelectProvider(type = OperationLogMapperSqlProvider.class, method = "findOperationLogByParams")
	public List<OperationLogBean> findOperationLogByParams(@Param("params")Map params);
}