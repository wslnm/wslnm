package com.wys.work.operationlogmag.queryservice;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author lyd
 * @version 1.0
 * 操作日志业务层接口
 */
public interface IOperationLogQueryService {

	/**
	 * 根据参数分页查询操作日志
	 * @param params 页面参数
	 */
	public Pager findOperationLogByParams2Pager(Map params,Pager pager);

}