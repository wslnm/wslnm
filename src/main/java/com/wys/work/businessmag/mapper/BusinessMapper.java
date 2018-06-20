package com.wys.work.businessmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;
import com.wys.work.beans.UserBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface BusinessMapper {
	
	/**
	 * 根据ID查询Business
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessIp",column="business_ip",javaType=String.class),
		@Result(property="tariffBean",javaType=TariffBean.class,column="fk_tariff_id",one=@One(select="findTariffById")),
		@Result(property="userBean",javaType=UserBean.class,column="fk_user_id",one=@One(select="findUserById"))
	})
	@Select("SELECT * FROM t_business where id=#{id} ")
	public BusinessBean findBusinessById(Long id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="tariffName",column="tariff_name",javaType=String.class),
		@Result(property="tariffType",column="tariff_type",javaType=Integer.class),
		@Result(property="basicTime",column="basic_time",javaType=Integer.class),
		@Result(property="basicCost",column="basic_cost",javaType=Integer.class),
		@Result(property="unitCost",column="unit_cost",javaType=Integer.class),
		@Result(property="tariffDirections",column="tariff_directions",javaType=String.class),
		@Result(property="tariffStatus",column="tariff_status",javaType=Integer.class)
	})
	@Select("select * from t_tariff where id=#{id}")
	public TariffBean findTariffById(Long id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="userAcc",column="user_acc",javaType=String.class),
		@Result(property="userPwd",column="user_pwd",javaType=String.class),
		@Result(property="userGender",column="user_gender",javaType=Integer.class),
		@Result(property="userTel",column="user_tel",javaType=String.class),
		@Result(property="userAddress",column="user_address",javaType=String.class),
		@Result(property="userIdcard",column="user_idcard",javaType=String.class),
		@Result(property="userZipcode",column="user_zipcode",javaType=Integer.class),
		@Result(property="userQq",column="user_qq",javaType=Integer.class)
	})
	@Select("select * from t_user where id=#{id}")
	public UserBean findUserById(Long id);
	
	/**
	 * 
	 * @param parmas
	 */
	@SelectProvider(type=BusinessMapperSqlProvider.class,method="findBusiness2Count")
	public long findBusiness2Count(@Param("parmas")Map parmas);

	/**
	 * 
	 * @param parmas
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessAcc",column="business_acc",javaType=String.class),
		@Result(property="businessPwd",column="business_pwd",javaType=String.class),
		@Result(property="businessIp",column="business_ip",javaType=String.class),
		@Result(property="tariffBean",javaType=TariffBean.class,column="fk_tariff_id",one=@One(select="findTariffById")),
		@Result(property="userBean",javaType=UserBean.class,column="fk_user_id",one=@One(select="findUserById"))
	})
	@SelectProvider(type=BusinessMapperSqlProvider.class,method="findBusinessByParams")
	public List<BusinessBean> findBusiness2List(@Param("pager")Pager pager, @Param("parmas")Map parmas);

}