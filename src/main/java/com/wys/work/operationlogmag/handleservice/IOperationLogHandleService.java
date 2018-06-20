package com.wys.work.operationlogmag.handleservice;

import com.wys.work.beans.OperationLogBean;

/**
 * @author lyd
 * @version 1.0
 * 操作日志业务层接口
 */
public interface IOperationLogHandleService {

	/**
	 * 新增操作日志
	 * @param operationLog 操作日志信息
	 */
	public void saveOperationLog(OperationLogBean operationLog);

}