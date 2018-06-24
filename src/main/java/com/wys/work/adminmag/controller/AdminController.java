package com.wys.work.adminmag.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wys.work.adminmag.handleservice.IAdminHandleService;
import com.wys.work.adminmag.queryservice.IAdminQueryService;
import com.wys.work.beans.AdminBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@RequestMapping("/adminmag")
@RestController
public class AdminController {

	@Resource
	public IAdminHandleService adminHandleServiceImpl;
	
	@Resource
	public IAdminQueryService adminQueryServiceImpl;

	/**
	 * 新增
	 * @param admin
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.POST},produces = {"application/json;charset=utf-8"})
	public void saveAdmin(AdminBean admin) {
		
		admin.setId(null);
		adminHandleServiceImpl.saveAdmin(admin);
		
	}

	/**
	 * 删除
	 * @param admin
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.DELETE},produces = {"application/json;charset=utf-8"})
	public void deleteAdmin(AdminBean admin) {
		
		adminHandleServiceImpl.deleteAdmin(admin);
		
	}
	
	/**
	 * 修改
	 * @param admin
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.PUT},produces = {"application/json;charset=utf-8"})
	public void updateAdmin(AdminBean admin) {
		
		adminHandleServiceImpl.updateAdmin(admin);
		
	}
	
	
	
	
	

}