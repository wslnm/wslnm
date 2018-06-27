package com.wys.work.servermag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.BusinessBillBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;
import com.wys.work.beans.UserBean;


/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
public interface ServerMapper {

	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="info",column="server_info"),
		@Result(property="loginTime",column="server_login_time"),
		@Result(property="exitTime",column="server_exit_time"),
		@Result(property="duration",column="server_duration"),
		@Result(property="acc",column="login_acc")
	})
	@Select(value= {"select * from t_server"})
	public List<ServerBean> findAllServers();
	
	@Results({
		@Result(id=true,property="id",column="id"),
		@Result(property="info",column="server_info"),
		@Result(property="loginTime",column="server_login_time"),
		@Result(property="exitTime",column="server_exit_time"),
		@Result(property="duration",column="server_duration"),
		@Result(property="acc",column="login_acc")
	})
	@Select(value= {"select * from t_server where login_acc=#{acc}"})
	public List<ServerBean> findServerBeanByAcc(@Param("acc") String acc);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name"),
		@Result(property="userAcc",column="user_acc"),
		@Result(property="userPwd",column="user_pwd"),
		@Result(property="userGender",column="user_gender"),
		@Result(property="userTel",column="user_tel"),
		@Result(property="userAddress",column="user_address"),
		@Result(property="userIdcard",column="user_idcard"),
		@Result(property="userZipcode",column="user_zipcode"),
		@Result(property="userQq",column="user_qq")
	})
	@Select(value= {"select * from t_user limit #{pager.index},#{pager.rows}"})
	public List<UserBean> findUser2List(@Param("pager")Pager pager);
	
	@Select(value= {"select count(*) from t_user"})
	public int findUser2Count();
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="accountingBillCost",column="accounting_bill_cost"),
		@Result(property="accountingBillMonth",column="accounting_bill_month"),
		@Result(property="accountingBillCostPayMethod",column="accounting_bill_pay_method"),
		@Result(property="accountingBillPayStatus",column="accounting_bill_pay_status"),
		@Result(property="year",column="year"),	
		@Result(property="userAcc",column="user_acc")
	})
	@Select(value= {"select * from t_accounting_bill where user_acc=#{acc} and year = #{year} order by accounting_bill_month"})
	public List<AccountingBillMonthBean> findBillsByYearAndAcc(@Param("acc")String acc,@Param("year")int year);

	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="businessBillOsAcc",column="business_bill_os_acc"),
		@Result(property="businessBillUserAcc",column="business_bill_user_acc"),
		@Result(property="businessBillServer",column="business_bill_server"),
		@Result(property="businessBillDuration",column="business_bill_duration"),
		@Result(property="year",column="year"),	
		@Result(property="month",column="month"),
		@Result(property="businessBillCost",column="business_bill_cost"),	
		@Result(property="businessBillTariffPackage",column="business_bill_tariff_package")
	})
	@Select(value= {"select * from t_business_bill where business_bill_user_acc= #{userAcc} and  year= #{year} and business_bill_os_acc=#{osAcc}"})
	public List<BusinessBillBean> findBusinessBillBeanByAccs(@Param("userAcc")String userAcc,@Param("year")int year,@Param("osAcc")String osAcc);
	
	@Results({
		@Result(property="businessBillOsAcc",column="business_bill_os_acc")
	})
	@Select(value= {"select business_bill_os_acc  from t_business_bill where business_bill_user_acc= #{userAcc} and  year= #{year} GROUP BY business_bill_os_acc order by month"})
	public List<String> findAllBusinessAcc(@Param("userAcc")String userAcc,@Param("year")int year);
	
	
}