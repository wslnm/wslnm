
package com.wys.work.operationlogmag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.operationlogmag.queryrepository.IOperationLogQueryRepository;
import com.wys.work.operationlogmag.queryservice.IOperationLogQueryService;

/**
 * @author lyd
 * @version 1.0
 */
@Service
public class OperationLogQueryServiceImpl implements IOperationLogQueryService {

	@Resource
	public IOperationLogQueryRepository operationLogQueryRepositoryImpl;

	/**
	 * 根据参数分页查询操作日志
	 * @param params 页面参数
	 */
	public Pager findOperationLogByParams2Pager(Map params,Pager pager){
		params.put("index", pager.getIndex());
		params.put("rows", pager.getRows());
		pager.setDatas(operationLogQueryRepositoryImpl.findOperationLogByParams(params));
		pager.setTotalRows(operationLogQueryRepositoryImpl.countOperationLogByParams(params));
		return pager;
	}

}