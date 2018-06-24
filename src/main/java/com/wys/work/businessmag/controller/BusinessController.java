package com.wys.work.businessmag.controller;

import com.wys.work.businessmag.queryservice.IBusinessQueryService;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wys.work.beans.BusinessBean;
import com.wys.work.businessmag.handleservice.IBusinessHandleService;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@RequestMapping("/businessmag")
@RestController
public class BusinessController {
	
	@Resource
	public IBusinessQueryService businessQueryServiceImpl;
	
	@Resource
	public IBusinessHandleService businessHandleServiceImpl;

	/**
	 * 新增
	 * @param business
	 */
	@RequestMapping(value="/savebusiness",method= {RequestMethod.POST},produces = {"application/json;charset=utf-8"})
	public void saveBusiness(BusinessBean business) {
		
		businessHandleServiceImpl.saveBusiness(business);
		
	}

	/**
	 * 删除
	 * @param business
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.DELETE},produces = {"application/json;charset=utf-8"})
	public void deleteBusiness(BusinessBean business) {
		
		businessHandleServiceImpl.deleteBusiness(business);
		
	}
	
	/**
	 * 修改
	 * @param business
	 */
	@RequestMapping(value="/{id}",method= {RequestMethod.PUT},produces = {"application/json;charset=utf-8"})
	public void updateBusiness(BusinessBean business) {
		
		businessHandleServiceImpl.updateBusiness(business);
		
	}
	
	
	
	

}