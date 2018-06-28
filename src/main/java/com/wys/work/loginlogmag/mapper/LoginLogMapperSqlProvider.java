package com.wys.work.loginlogmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * 登陆日志mapper方法的提供类
 * @author lyd
 *
 */
public class LoginLogMapperSqlProvider {

	/**
	 * 登陆日志mapper方法countLoginLogByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String countLoginLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select count(*) from t_login_log where 1=1 ");
		if (params.get("admin")!=null&&StringUtils.hasLength(((String)params.get("admin")).trim())) {
			sb.append("and admin_name like concat('%','"+params.get("admin")+"','%') ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and operation_date >= '"+params.get("startTime")+"' ");
		}
		if ((params.get("endTime") != null)) {
			sb.append("and operation_date <= '" + params.get("endTime")+"'");
		}
		return sb.toString();
	}
	
	
	/**
	 * 登陆日志mapper方法findLoginLogByParams的提供类
	 * @param map 参数
	 * @return sql
	 */
	public String findLoginLogByParams(Map map) {
		Map<String, Object> params = (Map<String, Object>) map.get("params");
		StringBuilder sb = new StringBuilder("select * from t_login_log where 1=1 ");
		if (params.get("admin")!=null&&StringUtils.hasLength(((String)params.get("admin")).trim())) {
			sb.append("and admin_name like concat('%','"+params.get("admin")+"','%') ");
		}
		if (params.get("startTime")!=null) {
			sb.append("and operation_date > '"+params.get("startTime")+"' ");
		}
		if ((params.get("endTime") != null)) {
			sb.append("and operation_date <= '" + params.get("endTime")+"'");
		}
	
		sb.append("limit "+params.get("index")+","+params.get("rows"));
		return sb.toString();
	}
	
}
