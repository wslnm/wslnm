package com.wys.work.businessbillmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.BusinessBillBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessBillHandleRepository extends JpaRepository<BusinessBillBean, Long>,JpaSpecificationExecutor<BusinessBillBean>{


}