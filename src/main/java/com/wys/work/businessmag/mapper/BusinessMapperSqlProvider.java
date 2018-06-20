package com.wys.work.businessmag.mapper;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.wys.work.beans.Pager;

public class BusinessMapperSqlProvider {
	
	public String findBusinessByParams(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		Pager pager=(Pager) map.get("pager");
		StringBuilder sb = new StringBuilder("SELECT count(*) FROM t_business where 1=1 ");
		String businessAcc = params.get("businessAcc").toString();
		if(StringUtils.hasLength(businessAcc)) {
			sb.append("and business_acc like CONCAT('"+businessAcc+"','%') ");
		}
		String businessIp = params.get("businessIp").toString();
		if(StringUtils.hasLength(businessIp)) {
			sb.append("and business_ip like CONCAT('"+businessIp+"','%') ");
		}
		int index=pager.getIndex();
		int rows=pager.getRows();
		sb.append("order by id desc limit "+index+","+rows+"");
		return sb.toString();
	}
	
	public String findBusiness2Count(Map<String, Object> map) {
		Map params = (Map) map.get("parmas");
		StringBuilder sb = new StringBuilder("SELECT count(*) FROM t_business where 1=1 ");
		String businessAcc = params.get("businessAcc").toString();
		if(StringUtils.hasLength(businessAcc)) {
			sb.append("and business_acc like CONCAT('"+businessAcc+"','%') ");
		}
		String businessIp = params.get("businessIp").toString();
		if(StringUtils.hasLength(businessIp)) {
			sb.append("and business_ip like CONCAT('"+businessIp+"','%') ");
		}
		return sb.toString();
	}
	

}
