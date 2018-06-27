package com.wys.work.tariffmag.queryrepository;


import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface ITariffQueryRepository {

	/**
	 * 
	 * @param pager
	 * @param params
	 */
	public Pager findTariffBean2Pager(Pager pager);
	
	public TariffBean findOneTariff(Long id);

}