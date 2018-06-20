package com.wys.work.businessmag.queryrepository;

import java.util.Map;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.Pager;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessQueryRepository {
	
	/**
	 * 根据ID查询Business
	 * @param id
	 * @return
	 */
	public BusinessBean findBusinessById(Long id);

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	public Pager findBusiness2Pager(Pager pager, Map parmas);

}