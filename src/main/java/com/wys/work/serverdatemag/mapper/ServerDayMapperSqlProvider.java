package com.wys.work.serverdatemag.mapper;

import java.util.Map;

import com.mysql.jdbc.StreamingNotifiable;
import com.wys.work.beans.Pager;

public class ServerDayMapperSqlProvider {

	
	public String findServerDay2List(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select * from t_server_day where 1=1  ");
		int day=(int) map.get("day");
		String userAcc=(String) map.get("userAcc");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(day!=0) {
			sb.append("and day ="+day+" ");
		}
		if(userAcc!=null) {
			sb.append("and user_acc ="+userAcc+" ");
		}
		sb.append("order by id desc limit "+index+","+rows+"");
		return sb.toString();
	}
	  
	
	public String findServerDay2Count(Map<String, Object> params) {
		Map map=(Map) params.get("params");
		Pager pager=(Pager) params.get("pager");
		StringBuilder sb=new StringBuilder("select count(*) from t_server_day where 1=1  ");
		int day=(int) map.get("day");
		String userAcc=(String) map.get("userAcc");
		int index=pager.getIndex();
		int rows=pager.getRows();
		if(day!=0) {
			sb.append("and day ='"+day+"'");
		}
		if(userAcc!=null) {
			sb.append("and user_acc ="+userAcc+" ");
		}
		return sb.toString();
	}
	
}
