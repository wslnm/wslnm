package com.wys.work.servermag.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.BusinessBillBean;
import com.wys.work.beans.Pager;
import com.wys.work.beans.UserBean;
import com.wys.work.servermag.handleservice.IServerHandleService;
import com.wys.work.servermag.queryservice.IServerQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
@Controller
@RequestMapping("/server")
public class ServerController {

	@Resource
	public IServerHandleService serverHandleServiceImpl;
	
	@Resource
	public IServerQueryService serverQueryServiceImpl;

	@RequestMapping(value="/table")
	@ResponseBody
	public Map findTableDatas(@RequestParam("page")Integer page,@RequestParam("limit")Integer rows) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 99);   

		Pager pager=new Pager(page,rows);
		Pager cutPage=serverQueryServiceImpl.findUser2Pager(pager);
		List list=cutPage.getDatas();
		map.put("data", list);
		System.out.println(list);
		return map;
	}
	
	
	@RequestMapping(value="/yearPie")
	@ResponseBody
	public ModelAndView giveBillInfoToPage(String acc) {
		List<AccountingBillMonthBean> list=serverQueryServiceImpl.findBillsByYearAndAcc(acc, 2018);
		ModelAndView mv=new ModelAndView();
		System.out.println(list);
		mv.addObject("list", list);
		mv.addObject("acc", acc);
		mv.setViewName("yearBillReport");
		return mv;
		
	}
	
	
	
	@RequestMapping(value="/btnCheckYear")
	@ResponseBody
	public ModelAndView giveBillInfoToPageByYear(String acc,String year) {
		int year2=2018;
		if(year!=null&&!StringUtils.isEmpty(year)&&year!="") {
			year2=Integer.parseInt(year);
		}
		List<AccountingBillMonthBean> list=serverQueryServiceImpl.findBillsByYearAndAcc(acc, year2);
		ModelAndView mv=new ModelAndView();
		mv.addObject("list", list);
		mv.addObject("acc", acc);
		mv.setViewName("yearBillReport");
		return mv;
		
	}
	
	
	
	@RequestMapping(value="/yearCategory")
	@ResponseBody
	public ModelAndView giveBillBusinessInfoToPage(String acc) {
		
		List listimpor=new ArrayList<>();
		ModelAndView mv=new ModelAndView();
		
		List<String> listAcc=serverQueryServiceImpl.findAllBusinessAcc(acc, 2018);
		for (int i = 0; i < listAcc.size(); i++) {
			String osAcc=listAcc.get(i);
			List<BusinessBillBean> list=serverQueryServiceImpl.findBusinessBillBeanByAccs(acc, 2018, osAcc);
			List<Integer> listdata=new ArrayList<Integer>();
			for (BusinessBillBean businessBillBean : list) {
				listdata.add(businessBillBean.getBusinessBillCost());
			}
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("name", osAcc);
			map.put("type", "line");
			map.put("stack", "总量");
			map.put("data", listdata);
			listimpor.add(map);
		}
		mv.addObject("acc", acc);
		mv.addObject("listimpor", listimpor);
		mv.setViewName("yearBusinessReport");
		System.out.println(listimpor);
		return mv;
		
	}
	
}