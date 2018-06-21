package com.wys.work.operationlogmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * @author lyd
 * 操作日志mapper方法的提供类
 */
public class OperationLogMapperSqlProvider {
	
	/**
	 * 操作日志mapper方法countLoginLogByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countOperationLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_operation_log where 1=1 ");
		if (params.get("admin")!=null&&StringUtils.hasLength(((String)params.get("admin")).trim())) {
			sb.append("and admin_name like concat('"+params.get("admin")+"','%') ");
		}
		if (params.get("role")!=null) {
			sb.append("and role_name = "+params.get("role")+" ");
		}
		if (params.get("mod")!=null) {
			sb.append("and system_mod = "+params.get("mod")+" ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and operation_date >= '"+params.get("time")+"' ");
		}

		return sb.toString();
	}
	
	
	/**
	 * 登陆日志mapper方法findLoginLogByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findOperationLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_operation_log where 1=1 ");
		if (params.get("admin")!=null&&StringUtils.hasLength(((String)params.get("admin")).trim())) {
			sb.append("and admin_name like concat('"+params.get("admin")+"','%') ");
		}
		if (params.get("role")!=null) {
			sb.append("and role_name = "+params.get("role")+" ");
		}
		if (params.get("mod")!=null) {
			sb.append("and system_mod = "+params.get("mod")+" ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and operation_date >= '"+params.get("time")+"' ");
		}

		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
}
