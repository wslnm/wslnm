package com.wys.work.tariffmag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.Pager;
import com.wys.work.tariffmag.queryrepository.ITariffQueryRepository;
import com.wys.work.tariffmag.queryservice.ITariffQueryService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Service
public class TariffQueryServiceImpl implements ITariffQueryService {
    @Resource
	public ITariffQueryRepository tariffQueryRepositoryImpl;

	/**
	 * 
	 * @param params
	 * @param pager
	 */
	public Pager findTariffBean2Pager(Pager pager){
		return tariffQueryRepositoryImpl.findTariffBean2Pager(pager);
	}

}