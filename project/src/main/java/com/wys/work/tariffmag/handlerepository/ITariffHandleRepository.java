package com.wys.work.tariffmag.handlerepository;

import com.wys.work.beans.TariffBean;

/**
 * ������handle�־ò�
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface ITariffHandleRepository {

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