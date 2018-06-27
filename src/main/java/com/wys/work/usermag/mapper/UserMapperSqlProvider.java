package com.wys.work.usermag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.wys.work.beans.Pager;

public class UserMapperSqlProvider {
	
	public String findUserBean2List(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		Pager pager=(Pager) map.get("pager");
		StringBuilder sb = new StringBuilder("SELECT * FROM t_user where 1=1 ");
		String userAcc = params.get("userAcc").toString();
		if(StringUtils.hasLength(userAcc)) {
			sb.append("and user_acc like CONCAT('"+userAcc+"','%') ");
		}
		String userName = params.get("userName").toString();
		if(StringUtils.hasLength(userName)) {
			sb.append("and user_name like CONCAT('"+userName+"','%') ");
		}
		
		int index=pager.getIndex();
		int rows=pager.getRows();
		sb.append("order by id desc limit "+index+","+rows+"");
		
		return sb.toString();
	}
	
	public String findUserBean2Count(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		StringBuilder sb = new StringBuilder("SELECT * FROM t_user where 1=1 ");
		String userAcc = params.get("userAcc").toString();
		if(StringUtils.hasLength(userAcc)) {
			sb.append("and user_acc like CONCAT('"+userAcc+"','%') ");
		}
		String userName = params.get("userName").toString();
		if(StringUtils.hasLength(userName)) {
			sb.append("and user_name like CONCAT('"+userName+"','%') ");
		}
		
		return sb.toString();
	}
	

}
