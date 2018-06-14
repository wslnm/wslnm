package com.wys.work.accountingbillmag.mapper;

import java.util.List;
import java.util.Map;

import com.wys.work.beans.Pager;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
public interface AccountingBillYearMapper {

	/**
	 * 
	 * @param map
	 */
	public int findAccountBillYear2Count(Map map);

	/**
	 * 
	 * @param map
	 */
	public List findAccountingYear2List(Map map);

}