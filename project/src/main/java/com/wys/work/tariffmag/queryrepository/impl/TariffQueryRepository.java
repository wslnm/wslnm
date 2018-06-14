package com.wys.work.tariffmag.queryrepository.impl;

import java.util.Map;

import com.wys.work.beans.Pager;
import com.wys.work.tariffmag.queryrepository.ITariffQueryRepository;
import com.wys.work.tariffmag.mapper.TariffMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
public class TariffQueryRepository implements ITariffQueryRepository {

	public TariffMapper m_TariffMapper;

	public TariffQueryRepository(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param pager
	 * @param params
	 */
	public Pager findTariffBean2Pager(Pager pager, Map params){
		return null;
	}

}