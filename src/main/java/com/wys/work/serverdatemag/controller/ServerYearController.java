package com.wys.work.serverdatemag.controller;

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
import com.wys.work.serverdatemag.handlerservice.IServerYearHandleService;
import com.wys.work.serverdatemag.queryservice.IServerYearQueryService;
import com.wys.work.servermag.queryservice.IServerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:16
 */

@Controller
@RequestMapping("/serverYear")
public class ServerYearController {

	public IServerYearHandleService serverYearHandleServiceImpl;
	
	@Resource
	public IServerYearQueryService serverYearQueryServiceImpl;
	
	@Resource
	private IServerQueryService serverQueryServiceImpl;

	
	@RequestMapping(value="/check",method= {RequestMethod.GET}, produces = { "application/json;charset=utf-8" })
	public ModelAndView find(ServerBean server) {
		ModelAndView mv=new ModelAndView();
		String acc=server.getAcc();
		mv.addObject("acc", acc);
		mv.addObject("year", 0);
		boolean bool=serverQueryServiceImpl.findServerBeanByAcc(acc);
		System.out.println(bool);
		if(bool) {
			mv.setViewName("server_year");
		}else {
			mv.setViewName("server_tennsi");
		}		
		return mv;
	}
	
	

	@RequestMapping(value="/table")
	@ResponseBody
	public Map findTableDatas(String acc,String year,@RequestParam("page")Integer page,@RequestParam("limit")Integer rows) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 99);   
		
		Map<String,Object> params=new HashMap<String,Object>();
		
		params.put("year", 0);
		if(year!=null&&year!="") {
			int year2=Integer.parseInt(year);
			params.put("year", year2);
		}
		
		params.put("userAcc", acc);

		Pager pager=new Pager(page,rows);
		Pager cutPage=serverYearQueryServiceImpl.findServerYear2Pgaer(pager, params);
		List list=cutPage.getDatas();
		map.put("data", list);
		return map;
	}
	
	
	@RequestMapping(value="/btnCheck")
	@ResponseBody
	public ModelAndView findTableDatasByYear(String year,String acc) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("year", "");
		if(year!=null&&year!="") {
			mv.addObject("year", year);
		}
		
		mv.addObject("acc", acc);
		mv.setViewName("server_year");
		return mv;
	}
	
	@RequestMapping(value="/jump")
	@ResponseBody
	public ModelAndView giveDatasToMonth(String year,String acc) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("year", year);
		mv.addObject("acc", acc);
		mv.addObject("month", 0);
		mv.setViewName("server_month");
		return mv;
	}

}