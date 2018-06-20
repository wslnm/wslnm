package com.wys.work.serverdatemag.mapper;

import java.util.Map;

import com.wys.work.beans.Pager;

public class ServerMonthMapperSqlProvider {

	public String findServerMonth2List(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select * from t_server_month where 1=1  ");
		int month=(int) map.get("month");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(month!=0) {
			sb.append("and month ="+month+" ");
		}
		sb.append("order by id desc limit "+index+","+rows+"");
		return sb.toString();
	}
	
	
	public String findServerMonth2Count(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select count(*) from t_server_month where 1=1  ");
		int month=(int) map.get("month");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(month!=0) {
			sb.append("and month ="+month+" ");
		}
		return sb.toString();
	}
}