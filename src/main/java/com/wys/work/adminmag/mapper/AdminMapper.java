package com.wys.work.adminmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface AdminMapper {

	/**
	 * 查询出的总条数
	 * @param parmas
	 */
	public long findAdmin2Count(Map parmas);

	/**
	 * 查询出的数据集合
	 * @param parmas
	 */
	@ResultType(AdminBean.class)
	@SelectProvider(type=AdminMapperSqlProvider.class,method="findAdminsByParams")
	public List<AdminBean> findAdmin2List(@Param("parmas")Map parmas);

}