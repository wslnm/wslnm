package com.wys.work.serverdatemag.mapper;

import java.util.Map;

import com.wys.work.beans.Pager;

public class ServerYearMapperSqlProvider {

	public String findServerYear2List(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select * from t_server_year where 1=1  ");
		int year=(int) map.get("year");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(year!=0) {
			sb.append("and year ="+year+" ");
		}
		sb.append("order by id desc limit "+index+","+rows+"");
		return sb.toString();
	}
	
	public String findServerYear2Count(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select count(*) from t_server_year where 1=1  ");
		int year=(int) map.get("year");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(year!=0) {
			sb.append("and year ="+year+" ");
		}
		return sb.toString();
	}
}
