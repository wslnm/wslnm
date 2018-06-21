package com.wys.work.serverdatemag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerDayBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface ServerDayMapper {
	
	
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="month",column="month"),
		@Result(property="day",column="day"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@Select(value= {"select * from t_server_day"})
	public List<ServerDayBean> findAllServerDay();

	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="month",column="month"),
		@Result(property="day",column="day"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@Select(value= {"select * from t_server_day where day = #{day}"})
	public ServerDayBean findServerDayByDay(@Param("day")int day);
	
	
	/**
	 * 
	 * @param parmas
	 */
	@SelectProvider(type=ServerDayMapperSqlProvider.class,method="findServerDay2Count")
	public int findServerDay2Count(@Param("pager")Pager pager, @Param("params")Map params);

	/** 
	 * 
	 * @param parmas
	 */
	
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="month",column="month"),
		@Result(property="day",column="day"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@SelectProvider(type=ServerDayMapperSqlProvider.class,method="findServerDay2List")
	public List<ServerDayBean> findServerDay2List(@Param("pager")Pager pager, @Param("params")Map params);
	
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="year",column="year"),
		@Result(property="month",column="month"),
		@Result(property="day",column="day"),
		@Result(property="totalTime",column="tatol_time"),
		@Result(property="name",column="service_name"),
		@Result(property="acc",column="user_acc")
	})
	@Select(value= {"select * from t_server_day where month =#{month} and year=#{year} "})
	public List<ServerDayBean> findServerMonthTotalTimeByMonth(@Param("month")int month,@Param("year")int year);

}