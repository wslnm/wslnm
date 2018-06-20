package com.wys.work.adminmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.wys.work.beans.Pager;

public class AdminMapperSqlProvider {
	
	public String findAdminsByParams(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		Pager pager=(Pager) map.get("pager");
		StringBuilder sb = new StringBuilder("SELECT * FROM t_admin where 1=1 ");
		String adminName = params.get("adminName").toString();
		if(StringUtils.hasLength(adminName)) {
			sb.append("and admin_name like CONCAT('"+adminName+"','%') ");
		}
		String adminAcc = params.get("adminAcc").toString();
		if(StringUtils.hasLength(adminAcc)) {
			sb.append("and admin_acc like CONCAT('"+adminAcc+"','%') ");
		}
		String adminTel = params.get("adminTel").toString();
		if(StringUtils.hasLength(adminTel)) {
			sb.append("and admin_tel like CONCAT('"+adminTel+"','%') ");
		}
		int index=pager.getIndex();
		int rows=pager.getRows();
		sb.append("order by id desc limit "+index+","+rows+"");
		
		return sb.toString();
	}
	
	public String findAdmins2Count(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		StringBuilder sb = new StringBuilder("SELECT count(*) FROM t_admin where 1=1 ");
		String adminName = params.get("adminName").toString();
		if(StringUtils.hasLength(adminName)) {
			sb.append("and admin_name like CONCAT('"+adminName+"','%') ");
		}
		String adminAcc = params.get("adminAcc").toString();
		if(StringUtils.hasLength(adminAcc)) {
			sb.append("and admin_acc like CONCAT('"+adminAcc+"','%') ");
		}
		String adminTel = params.get("adminTel").toString();
		if(StringUtils.hasLength(adminTel)) {
			sb.append("and admin_tel like CONCAT('"+adminTel+"','%') ");
		}
		          
		return sb.toString();
	}
	
	
	
}
