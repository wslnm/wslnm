package com.wys.work.operationlogmag.controller;

import com.wys.work.operationlogmag.queryservice.IOperationLogQueryService;
import com.wys.work.operationlogmag.handleservice.IOperationLogHandleService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wys.work.beans.OperationLogBean;
import com.wys.work.beans.Pager;

/**
 * @author lyd
 * @version 1.0
 * 操作日志控制层
 */
@RestController
@RequestMapping("/operationlog")
public class OperationLogController {

	@Resource
	public IOperationLogQueryService operationLogQueryServiceImpl;

	@RequestMapping(value="/get",method= {RequestMethod.GET},produces = { "application/json;charset=utf-8" })
	public Pager findOperationLog2Pager(Pager pager,String admin,Integer role,Integer mod,Date startTime,Date endTime) {
		Map<String, Object> params = new HashMap<>();
		params.put("admin", admin);
		params.put("role", role);//角色名称(等级)
		params.put("mod", mod);//模块
		params.put("startTime", startTime);
		params.put("endTime", endTime);
		operationLogQueryServiceImpl.findOperationLogByParams2Pager(params, pager);
		return pager;
	}
}