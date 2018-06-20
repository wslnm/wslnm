package com.wys.work.adminmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.RoleBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface AdminMapper {

	/**
	 * 根据ID查询Admin
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admin_name",javaType=String.class),
		@Result(property="adminAcc",column="admin_acc",javaType=String.class),
		@Result(property="adminPwd",column="admin_pwd",javaType=String.class),
		@Result(property="adminTel",column="admin_tel",javaType=String.class),
		@Result(property="adminEmail",column="admin_email",javaType=String.class),
		@Result(property="role",javaType=RoleBean.class,column="fk_role_id",one=@One(select="findRoleByID"))
	})
	@Select("SELECT * FROM t_admin where id=#{id} ")
	public AdminBean findAdminById(Long id);

	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="roleName",column="role_name",javaType=String.class),
		@Result(property="roleType",column="role_type",javaType=String.class)
	})
	@Select("select * from t_role where id=#{id}")
	public RoleBean findRoleByID(Long id);
	
	/**
	 * 查询出的总条数
	 * @param parmas
	 */
	@SelectProvider(type=AdminMapperSqlProvider.class,method="findAdmins2Count")
	public long findAdmin2Count(@Param("parmas")Map parmas);

	/**
	 * 查询出的数据集合
	 * @param parmas
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admin_name",javaType=String.class),
		@Result(property="adminAcc",column="admin_acc",javaType=String.class),
		@Result(property="adminPwd",column="admin_pwd",javaType=String.class),
		@Result(property="adminTel",column="admin_tel",javaType=String.class),
		@Result(property="adminEmail",column="admin_email",javaType=String.class),
		@Result(property="role",javaType=RoleBean.class,column="fk_role_id",one=@One(select="findRoleByID"))
	})
	@SelectProvider(type=AdminMapperSqlProvider.class,method="findAdminsByParams")
	public List<AdminBean> findAdmin2List(@Param("pager")Pager pager, @Param("parmas")Map parmas);
	
	/**
	 * 进行登录并查询到此管理员的个人信息
	 * @param adminAcc
	 * @param adminPwd
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="adminName",column="admin_name",javaType=String.class),
		@Result(property="adminAcc",column="admin_acc",javaType=String.class),
		@Result(property="adminPwd",column="admin_pwd",javaType=String.class),
		@Result(property="adminTel",column="admin_tel",javaType=String.class),
		@Result(property="adminEmail",column="admin_email",javaType=String.class),
		@Result(property="role",javaType=RoleBean.class,column="fk_role_id",one=@One(select="findRoleByID"))
	})
	@Select(value= {"select * from t_admin where admin_acc = #{adminAcc} and admin_pwd = #{adminPwd}"})
	public AdminBean login(@Param("adminAcc")String adminAcc,@Param("adminPwd")String adminPwd);
}