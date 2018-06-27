package com.wys.work.serverdatemag.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.Pager;
import com.wys.work.serverdatemag.handlerservice.IServerDayHandleService;
import com.wys.work.serverdatemag.queryservice.IServerDayQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
@Controller
@RequestMapping("/serverDay")
public class ServerDayController {

	@Resource
	private IServerDayHandleService serverDayHandleServiceImpl;
	
	@Resource
	private IServerDayQueryService serverDayQueryServiceImpl;

	@RequestMapping(value="/table")
	@ResponseBody
	public Map findTableDatas(String acc,String year,String month,String day,@RequestParam("page")Integer page,@RequestParam("limit")Integer rows) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 99);   
		
		Map<String,Object> params=new HashMap<String,Object>();
		
		int year2=Integer.parseInt(year);
		params.put("year", year2);
		
		int month2=Integer.parseInt(month);
		params.put("month", month2);
		
		params.put("day", 0);
		if(day!=null&&day!="") {
			int day2=Integer.parseInt(day);
			params.put("day", day2);
		}
		
		params.put("userAcc", acc);
		
		params.put("year", year2);
		Pager pager=new Pager(page,rows);
		Pager cutPage=serverDayQueryServiceImpl.findServerDay2Pager(pager, params);
		List list=cutPage.getDatas();
		map.put("data", list);
		System.out.println(list);
		return map;
	}
	
	
	
	@RequestMapping(value="/btnDayCheck")
	@ResponseBody
	public ModelAndView findTableDatasByDay(String year,String month,String acc,String day) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("day", "");
		if(day!=null&&day!="") {
			mv.addObject("day", day);
		}
		mv.addObject("month", month);
		mv.addObject("year", year);
		mv.addObject("acc", acc);
		mv.setViewName("server_day");
		return mv;
	}

}