package com.wys.work.businessmag.controller;

import com.wys.work.businessmag.queryservice.IBusinessQueryService;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.DataGrid;
import com.wys.work.beans.MessagerBean;
import com.wys.work.beans.Pager;
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
	public ModelAndView saveBusiness(BusinessBean business) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		businessHandleServiceImpl.saveBusiness(business);
		
		modelAndView.setViewName("FindAccount");
		
		return modelAndView;
		
	}

	/**
	 * 删除
	 * @param business
	 */
	@RequestMapping(value="/many",method= {RequestMethod.DELETE},produces = {"application/json;charset=utf-8"})
	public MessagerBean deleteBusiness(@RequestBody List<BusinessBean> business) {
		MessagerBean msg = new MessagerBean(true, 0, "操作成功！");
		for (BusinessBean businessBean : business) {
			businessHandleServiceImpl.deleteBusiness(businessBean);
		}
		
		return msg;
	}
	
	/**
	 * 修改
	 * @param business
	 */
	@RequestMapping(value="/update",method= {RequestMethod.PUT},produces = {"application/json;charset=utf-8"})
	public ModelAndView updateBusiness(BusinessBean business) {
		ModelAndView modelAndView = new ModelAndView();
		
		businessHandleServiceImpl.updateBusiness(business);
		
		modelAndView.setViewName("FindAccount");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/findbusiness")
	@ResponseBody
	public DataGrid findBusiness(Map parmas, Pager pager) {
		parmas.put("peopleInfo", !StringUtils.isEmpty("peopleInfo")?"peopleInfo":"");
		parmas.put("name", !StringUtils.isEmpty("name")?"name":"");
		pager = businessQueryServiceImpl.findBusiness2Pager(pager, parmas);
		DataGrid dataGrid = new DataGrid((long)pager.getTotalRows(), pager.getDatas());
		return dataGrid;
	}
	

}