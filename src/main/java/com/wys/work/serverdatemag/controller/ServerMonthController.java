package com.wys.work.serverdatemag.controller;

import com.wys.work.serverdatemag.queryservice.IServerMonthQueryService;
import com.wys.work.servermag.queryservice.IServerQueryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.Pager;
import com.wys.work.beans.ServerBean;
import com.wys.work.serverdatemag.handlerservice.IServerMonthHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */
@Controller
@RequestMapping("/serverMonth")
public class ServerMonthController {

	@Resource
	private IServerMonthQueryService serverMonthQueryServiceImpl;
	
	@Resource
	private IServerMonthHandleService serverMonthHandleServiceImpl;
	
	@Resource
	private IServerQueryService serverQueryServiceImpl;

	
	@RequestMapping(value="/check",method= {RequestMethod.GET}, produces = { "application/json;charset=utf-8" })
	public ModelAndView find(ServerBean server) {
		ModelAndView mv=new ModelAndView();
		String acc=server.getAcc();
		mv.addObject("year", 0);
		mv.addObject("acc", acc);
		mv.addObject("month", 0);
		boolean bool=serverQueryServiceImpl.findServerBeanByAcc(acc);
		System.out.println(bool);
		if(bool) {
			mv.setViewName("server_month");
		}else {
			mv.setViewName("server_tennsi");
		}		
		return mv;
	}
	
	
	
	@RequestMapping(value="/table")
	@ResponseBody
	public Map findTableDatas(String acc,String year,String month,@RequestParam("page")Integer page,@RequestParam("limit")Integer rows) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 99);   
		
		Map<String,Object> params=new HashMap<String,Object>();
		
		params.put("month", 0);
		if(month!=null&&month!="") {
			int month2=Integer.parseInt(month);
			params.put("month", month2);
		}
		
		params.put("userAcc", acc);
		int year2=Integer.parseInt(year);
		params.put("year", year2);
		Pager pager=new Pager(page,rows);
		Pager cutPage=serverMonthQueryServiceImpl.findServerMonth2Pager(pager, params);
		List list=cutPage.getDatas();
		map.put("data", list);
		return map;
	}
	
	@RequestMapping(value="/btnMonthCheck")
	@ResponseBody
	public ModelAndView findTableDatasByYear(String year,String month,String acc) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("month", "");
		if(month!=null&&month!="") {
			mv.addObject("month", month);
		}
		mv.addObject("year", year);
		mv.addObject("acc", acc);
		mv.setViewName("server_month");
		return mv;
	}
	
	@RequestMapping(value="/jump")
	@ResponseBody
	public ModelAndView giveDatasToDay(String year,String acc,String month) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("year", year);
		mv.addObject("acc", acc);
		mv.addObject("month", month);
		mv.addObject("day", 0);
		mv.setViewName("server_day");
		return mv;
	}
	
}