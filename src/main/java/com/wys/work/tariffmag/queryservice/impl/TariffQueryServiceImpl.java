package com.wys.work.tariffmag.queryservice.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.tariffmag.queryrepository.ITariffQueryRepository;
import com.wys.work.tariffmag.queryservice.ITariffQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public class TariffQueryServiceImpl implements ITariffQueryService {

	public ITariffQueryRepository m_ITariffQueryRepository;

	public TariffQueryServiceImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param params
	 * @param pager
	 */
	public Pager findTariffBean2Pager(Map params, Pager pager){
		return null;
	}

}