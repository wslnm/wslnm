package com.wys.work.adminmag.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wys.work.adminmag.handleservice.IAdminHandleService;
import com.wys.work.adminmag.queryservice.IAdminQueryService;
import com.wys.work.beans.AdminBean;
import com.wys.work.beans.DataGrid;
import com.wys.work.beans.MessagerBean;
import com.wys.work.beans.Pager;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@RequestMapping("/adminmag")
@RestController
public class AdminController {

	@Resource
	public IAdminHandleService adminHandleServiceImpl;
	
	@Resource
	public IAdminQueryService adminQueryServiceImpl;

	/**
	 * 新增
	 * @param admin
	 */
	@RequestMapping(value="/addadmin",method= {RequestMethod.POST})
	public ModelAndView saveAdmin(AdminBean admin) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		adminHandleServiceImpl.saveAdmin(admin);
		
		modelAndView.setViewName("adminmag");
		
		return modelAndView;
		
	}

	/**
	 * 删除
	 * @param admin
	 */
	@RequestMapping(value="/many",method= {RequestMethod.DELETE},produces = {"application/json;charset=utf-8"})
	public MessagerBean deleteAdmin(@RequestBody List<AdminBean> admins) {
		MessagerBean msg = new MessagerBean(true, 0, "操作成功！");
		for (AdminBean adminBean : admins) {
			adminHandleServiceImpl.deleteAdmin(adminBean);
		}
		return msg;
	}
	
	@RequestMapping(value="/update2")
	@ResponseBody
	public ModelAndView update2(AdminBean admin) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		adminHandleServiceImpl.updateAdmin(admin);
		
		modelAndView.setViewName("adminmag");
		
		return modelAndView;
	}
	
	/**
	 * 修改
	 * @param admin
	 */
	@RequestMapping(value="/update")
	@ResponseBody
	public ModelAndView updateAdmin(@RequestParam("id")Long id,@RequestParam("adminPwd")String adminPwd,@RequestParam("adminTel")String adminTel ) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		AdminBean adminBean = adminHandleServiceImpl.findById(id);
		System.out.println(adminBean);
		System.out.println("pwd:"+adminPwd);
		System.out.println("id:"+id);
		System.out.println("admin"+adminTel);
		
		if (adminPwd == null || StringUtils.isEmpty(adminPwd)) {
			
		}else {
			adminBean.setAdminPwd(adminPwd.trim());
		}
		if (adminTel == null || StringUtils.isEmpty(adminTel)) {
			
		} else {
			adminBean.setAdminTel(adminTel);
		}
		adminHandleServiceImpl.updateAdmin(adminBean);
		System.out.println("修改输出管理员对象为："+adminBean);
		
		if (adminPwd == null || adminTel == null ||  adminPwd =="" || adminTel == "") {
			modelAndView.setViewName("adminInfo");
		} else {
			modelAndView.setViewName("frontEndUserSystem");
		}
		
		return modelAndView; 
	}
	
	
	
	/**
	 * 管理员登录
	 * @param adminBean
	 * @return
	 */
	@RequestMapping(value="/login",method= {RequestMethod.GET},produces = {"application/json;charset=utf-8"})
	public ModelAndView login(AdminBean adminBean) {
		
		ModelAndView mv = new ModelAndView();
		try {
			AdminBean admin = adminQueryServiceImpl.login(adminBean.getAdminAcc(), adminBean.getAdminPwd());
			System.out.println("输出的管理员对象为："+admin);
			mv.addObject("admin", admin);
			
			if (admin != null) {
				mv.setViewName("adminInfo");
			}else {
				mv.setViewName("LoginUser");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping(value="/findadmin")
	@ResponseBody
	public DataGrid findAdmins(Map parmas, Pager pager) {
		
		parmas.put("adminname", !StringUtils.isEmpty("adminname")?"adminname":"");
		parmas.put("adminacc", !StringUtils.isEmpty("adminacc")?"adminacc":"");
		parmas.put("tel", !StringUtils.isEmpty("tel")?"tel":"");
		pager = adminQueryServiceImpl.findAdmins2Pager(parmas, pager);
		
		DataGrid dataGrid = new DataGrid((long)pager.getTotalRows(), pager.getDatas());
		
		return dataGrid;
	}
	

}