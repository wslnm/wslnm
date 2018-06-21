package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerYearBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerYearMapper {

	/**
	 * 
	 * @param parmas
	 */
	@SelectProvider(type=ServerYearMapperSqlProvider.class,method="findServerYear2Count")
	public int findServerYear2Count(@Param("pager")Pager pager, @Param("params")Map params);

	/**
	 * 
	 * @param parmas
	 */
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@SelectProvider(type=ServerYearMapperSqlProvider.class,method="findServerYear2List")
	public List<ServerYearBean> findServerYear2List(@Param("pager")Pager pager, @Param("params")Map params);

	
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@Select(value= {"select * from t_server_year where year= #{year}"})
	public ServerYearBean findServerYearByYear(@Param("year")int year);
}