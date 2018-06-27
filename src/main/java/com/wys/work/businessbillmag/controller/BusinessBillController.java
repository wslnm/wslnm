package com.wys.work.businessbillmag.controller;

import com.wys.work.businessbillmag.queryservice.IBusinessBillQueryService;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wys.work.beans.Pager;
import com.wys.work.businessbillmag.handleservice.IBusinessBillHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Controller
@RequestMapping(value = "/busbill")
public class BusinessBillController {
	
	@Resource
	public IBusinessBillQueryService businessBillQueryServiceImpl;
	
	@Resource
	public IBusinessBillHandleService businessBillHandleServiceImpl;

	@RequestMapping(value = "/findAll")
	@ResponseBody
	public Map findBusByUser(HttpServletRequest request) {
		String useracc = request.getParameter("useracc");
		Pager pager = new Pager();
		pager.setPage(Integer.parseInt(request.getParameter("page")));
		pager.setRows(Integer.parseInt(request.getParameter("limit")));
		Map pushmap = new HashMap<String, Object>();
		pushmap.put("pager", pager);
		pushmap.put("useracc", useracc);
		Pager newPager = businessBillQueryServiceImpl.findBusinessBill2Pager(pushmap);
		Map map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", newPager.getTotalRows());
		map.put("data", newPager.getDatas());
		return map;
	}
	
	
	
}