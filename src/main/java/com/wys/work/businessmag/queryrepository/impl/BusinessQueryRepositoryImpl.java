package com.wys.work.businessmag.queryrepository.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.Pager;
import com.wys.work.businessmag.queryrepository.IBusinessQueryRepository;
import com.wys.work.businessmag.mapper.BusinessMapper;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Repository
public class BusinessQueryRepositoryImpl implements IBusinessQueryRepository {

	@Resource
	public BusinessMapper bm;

	/**
	 * 
	 * @param pager
	 * @param parmas
	 */
	@Override
	public Pager findBusiness2Pager(Pager pager, Map parmas){
		Long a = bm.findBusiness2Count(parmas);
		int totalRows = a.intValue();
		List<BusinessBean> datas = bm.findBusiness2List(pager, parmas);
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		return pager;
	}

	@Override
	public BusinessBean findBusinessById(Long id) {
		// TODO Auto-generated method stub
		return bm.findBusinessById(id);
	}

}