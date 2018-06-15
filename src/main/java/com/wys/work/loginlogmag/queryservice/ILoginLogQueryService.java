package com.wys.work.loginlogmag.queryservice;

import java.util.Map;

import com.wys.work.beans.Pager;

public interface ILoginLogQueryService {
	
	public Pager findLoginLog2Pager(Map map);
}
