package com.wys.work.tariffmag.handleservice;

import com.wys.work.beans.TariffBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface ITariffHandleService {

	/**
	 * 
	 * @param tariff
	 */
	public void deleteTariffBean(TariffBean tariff);

	/**
	 * 
	 * @param tariff
	 */
	public void saveTariffBean(TariffBean tariff);

	/**
	 * 
	 * @param tariff
	 */
	public void updateTariffBean(TariffBean tariff);

}