package com.wys.work.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public interface UserMapper {

	/**
	 * 
	 * @param params
	 */
	public long findUserBean2Count(Map params);

	/**
	 * 
	 * @param params
	 */
	public List findUserBean2List(Map params);
	
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
		@Result(property="userPwd",column="user_pwd",javaType=String.class)
	})
	@Select(value= {"select id,user_name,user_acc,user_pwd from t_user where user_acc = #{userAcc} and user_pwd = #{userPwd}"})
	public UserBean login(@Param("userAcc")String userAcc,@Param("userPwd")String userPwd);

}