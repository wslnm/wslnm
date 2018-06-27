package com.wys.work.accountingbillmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wys.work.accountingbillmag.handleservice.IAcccountingBillHandleMonthService;
import com.wys.work.accountingbillmag.queryservice.IAccountingBillQueryMonthService;
import com.wys.work.beans.AccountingBillMonthBean;
import com.wys.work.beans.Pager;


/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:11
 */
@Controller
@RequestMapping(value = "/accbill")
public class AccountingBillMonthController {

	@Resource
	public IAcccountingBillHandleMonthService acccountingBillHandleServiceImpl;
	@Resource
	public IAccountingBillQueryMonthService accountingBillQueryMonthServiceImpl;

	@RequestMapping(value = "/findAll")
	@ResponseBody
	public Map findAllAccbill(HttpServletRequest request) {
		Pager pager = new Pager();
		pager.setPage(Integer.parseInt(request.getParameter("page")));
		pager.setRows(Integer.parseInt(request.getParameter("limit")));
		Map pushmap = new HashMap<String, Object>();
		pushmap.put("pager", pager);
		//未加入模糊查询
		System.out.println(pushmap);
		Pager newPager = accountingBillQueryMonthServiceImpl.findAcccountingBill2Pager(pushmap);
		
		Map map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", newPager.getTotalRows());
		map.put("data", newPager.getDatas());
		System.out.println(map);
		return map;
	}
	
	@RequestMapping(value = "/payacc")
	public String payacc(HttpServletRequest request) {
		String useracc = request.getParameter("useracc");
		AccountingBillMonthBean bean = accountingBillQueryMonthServiceImpl.findOne(useracc);
		bean.setAccountingBillPayStatus(1);
		acccountingBillHandleServiceImpl.updateAccountingBillMonth(bean);
		return "redirect:/static/accountBill.ftl";
	}

}