package com.wys.work.tariffmag.mapper;

import java.util.List;

import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;


/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public interface TariffMapper {

	/**
	 * 
	 * @param params
	 */
	public int findTariffBean2Count(Pager pager);
	
	/**
	 * 
	 * @param params
	 */
	public List findTariffBean2List(Pager pager);
	
	public TariffBean findOneTariff(Long id);

}