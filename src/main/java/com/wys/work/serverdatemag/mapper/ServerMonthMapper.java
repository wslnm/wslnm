package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerMonthMapper {

	/**
	 * 
	 * @param parmas
	 */
	@SelectProvider(type=ServerMonthMapperSqlProvider.class,method="findServerMonth2Count")
	public int findServerMonth2Count(@Param("pager")Pager pager, @Param("params")Map params);

	/**
	 * 
	 * @param parmas
	 */
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="month",column="month"),
		@Result(property="totalTime",column="total_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@SelectProvider(type=ServerMonthMapperSqlProvider.class,method="findServerMonth2List")
	public List<ServerMonthBean> findServerMonth2List(@Param("pager")Pager pager, @Param("params")Map params);

}