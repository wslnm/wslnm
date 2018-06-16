package com.wys.work.adminmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminQueryRepository {

	public Pager findAdmins2Pager(Map parmas, Pager pager);
	
	public AdminBean findAdminById(Long id);
	
	/**
	 * 通过输入的管理员账号密码进行管理员登录
	 * @param adminAcc
	 * @param adminPwd
	 * @return 返回管理员个人信息
	 */
	public AdminBean login(String adminAcc,String adminPwd);

}