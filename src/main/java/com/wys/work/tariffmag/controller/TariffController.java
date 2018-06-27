package com.wys.work.tariffmag.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;
import com.wys.work.tariffmag.handleservice.ITariffHandleService;
import com.wys.work.tariffmag.queryservice.ITariffQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */

@Controller
@RequestMapping(value = "/tariff")
public class TariffController {
	
	@Resource
	public ITariffHandleService tariffHandleServiceImpl;
	
	@Resource
	public ITariffQueryService tariffQueryServiceImpl;
	
	@RequestMapping(value = "/findAll")
	@ResponseBody
	public Map findAllTariff(HttpServletRequest request) {
		Pager pager = new Pager();
		pager.setPage(Integer.parseInt(request.getParameter("page")));
		pager.setRows(Integer.parseInt(request.getParameter("limit")));
	
		Pager newPager = tariffQueryServiceImpl.findTariffBean2Pager(pager);
		Map map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", newPager.getTotalRows());
		map.put("data", newPager.getDatas());
		return map;
	}
	
	@RequestMapping(value = "/addTariff")
	public String addTariff(TariffBean bean) {
		tariffHandleServiceImpl.saveTariffBean(bean);
		return "redirect:/static/tariff.ftl";
	}
	
	@RequestMapping(value = "/deleteTariff")
	public String deleteTariff(TariffBean bean) {
		tariffHandleServiceImpl.deleteTariffBean(bean);
		return "redirect:/static/tariff.ftl";
	}
	
	@RequestMapping(value = "/upTariff")
	public String upTariff(TariffBean bean) {
		tariffHandleServiceImpl.updateTariffBean(bean);
		return "redirect:/static/tariff.ftl";
	}

	@RequestMapping(value = "/ooTariff")
	public String onOrOff(HttpServletRequest request) {
		String oo = request.getParameter("status");
		Long id = (long) Integer.parseInt(request.getParameter("id"));
		TariffBean bean = tariffQueryServiceImpl.findOneTariff(id);
		if(oo.equals("1")) {
			bean.setTariffStatus(1);
		}else {
			bean.setTariffStatus(0);
		}
		tariffHandleServiceImpl.updateTariffBean(bean);
		return "redirect:/static/tariff.ftl";
	}
}