package com.wys.work.loginlogmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.Pager;

public interface ILoginLogQueryRepository {
	/**
	 * 查询分页
	 * @param map
	 * @return
	 */
	public Pager findLoginLog2Pager(Map map);
}
