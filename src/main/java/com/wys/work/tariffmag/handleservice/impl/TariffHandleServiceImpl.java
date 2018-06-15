package com.wys.work.tariffmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.TariffBean;
import com.wys.work.tariffmag.handleservice.ITariffHandleService;
import com.wys.work.tariffmag.handlerepository.ITariffHandleRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Service
public class TariffHandleServiceImpl implements ITariffHandleService {

	@Resource
	public ITariffHandleRepository tariffHandleRepository;



	/**
	 * 
	 * @param tariff
	 */
	public void deleteTariffBean(TariffBean tariff){
		tariffHandleRepository.delete(tariff);
	}

	/**
	 * 
	 * @param tariff
	 */
	public void saveTariffBean(TariffBean tariff){
		tariffHandleRepository.save(tariff);
	}

	/**
	 * 
	 * @param tariff
	 */
	public void updateTariffBean(TariffBean tariff){
		tariffHandleRepository.saveAndFlush(tariff);
	}

}