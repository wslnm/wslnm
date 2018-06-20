package com.wys.work.operationlogmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.OperationLogBean;
import com.wys.work.operationlogmag.handleservice.IOperationLogHandleService;
import com.wys.work.operationlogmag.handlerepository.IOperationLogHandleRepository;

/**
 * @author lyd
 * @version 1.0
 * 操作日志持久层实现类
 */
@Service
public class OperationLogHandleServiceImpl implements IOperationLogHandleService {

	@Resource
	public IOperationLogHandleRepository operationLogHandleRepository;

	/**
	 * 新增操作日志
	 * @param operationLog 操作日志信息
	 */
	public void saveOperationLog(OperationLogBean operationLog){
		operationLogHandleRepository.save(operationLog);
	}

}