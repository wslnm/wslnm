package com.wys.work.accountingbillmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.AccountingBillMonthBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAcountingBillMonthRepository extends JpaRepository<AccountingBillMonthBean, Long>,JpaSpecificationExecutor<AccountingBillMonthBean>{


}