package com.wys.work.tariffmag.queryrepository.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.Pager;
import com.wys.work.beans.TariffBean;
import com.wys.work.tariffmag.queryrepository.ITariffQueryRepository;
import com.wys.work.tariffmag.mapper.TariffMapper;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:17
 */
@Repository
public class TariffQueryRepository implements ITariffQueryRepository {
	
	
    @Resource
	public TariffMapper tariffMapper;

	/**
	 * 
	 * @param pager
	 * @param params
	 */
	public Pager findTariffBean2Pager(Pager pager){
		int rows = (int) tariffMapper.findTariffBean2Count(pager);
		pager.setTotalRows(rows);
		
		List<TariffBean> list = tariffMapper.findTariffBean2List(pager);
		pager.setDatas(list);
		return pager;
	}

	@Override
	public TariffBean findOneTariff(Long id) {
		// TODO 自动生成的方法存根
		return tariffMapper.findOneTariff(id);
	}

}