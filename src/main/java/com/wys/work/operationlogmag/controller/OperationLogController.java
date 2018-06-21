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

public class OperationLogController {


	public IOperationLogQueryService operationLogQueryServiceImpl;


}