package com.wys.work.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public interface UserMapper {

	/**
	 * 查询出的总条数
	 * @param params
	 */
	@SelectProvider(type=UserMapperSqlProvider.class,method="findUserBean2Count")
	public long findUserBean2Count(@Param("parmas")Map params);

	/**
	 * 查询出的数据集合
	 * @param params
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userIdcard",column="user_idcard",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class)
	})
	@SelectProvider(type=UserMapperSqlProvider.class,method="findUserBean2List")
	public List findUserBean2List(@Param("parmas")Map params,@Param("pager")Pager pager);
	
	/**登录：查询是否有此账号、密码的用户
	 * 
	 * @param userAcc
	 * @param userPwd
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userIdcard",column="user_idcard",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class)
	})
	@Select(value= {"select * from t_user where user_acc = #{userAcc} and user_pwd = #{userPwd}"})
	public UserBean login(@Param("userAcc")String userAcc,@Param("userPwd")String userPwd);

}