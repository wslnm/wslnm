package com.wys.work.operationlogmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wys.work.beans.OperationLogBean;

/**
 * @author lyd
 * @version 1.0
 * 操作日志操作日志
 */
public interface IOperationLogHandleRepository extends JpaRepository<OperationLogBean, Long>{

}