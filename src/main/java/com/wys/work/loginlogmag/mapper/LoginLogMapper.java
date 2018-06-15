package com.wys.work.loginlogmag.mapper;

import java.util.List;
import java.util.Map;

public interface LoginLogMapper {
	/**
	 * 查询总登录日志
	 * @param map
	 * @return
	 */
	public int findLoginLog2Count(Map map);
	/**
	 * 集合
	 * @param map
	 * @return
	 */
	public List findLoginLog2List(Map map);
}
