package com.wys.work.loginlogmag.controller;

import com.wys.work.loginlogmag.queryservice.ILoginLogQueryService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.Pager;

/**
 * @author lyd
 * @version 1.0
 * 登陆日志控制层
 */
@Controller
@RestController
@RequestMapping("/loginlog")
public class LoginLogController {
	
	
	@Resource
	private ILoginLogQueryService loginLogQueryServiceImpl;
	
	@ResponseBody
	@RequestMapping(value="/getLoginLogPager",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Map findLoginLog2Pager(@RequestParam("page")Integer page,@RequestParam("limit")Integer limit,String admin,Date startTime,Date endTime) {
		
		Map map=new HashMap<>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 99);
		
		Map<String, Object> params = new HashMap<>();
		params.put("admin", admin);
		params.put("startTime", startTime);
		params.put("endTime", endTime);
		Pager pager=new Pager(page,limit);
		loginLogQueryServiceImpl.findLoginLogByParams2Pager(params, pager);
		
		
		map.put("data", pager.getDatas());
		
		return map;
	}
	@ResponseBody
	@RequestMapping(value="/giveparams2Page")
	public ModelAndView givearams2Page(String adminName,String startTime,String endTime) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("adminName", adminName);
		mv.addObject("startTime", endTime);
		mv.addObject("endTime", endTime);
		mv.setViewName("loginDiary");
		return mv;
	}
	
	
	
	
}