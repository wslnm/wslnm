package com.wys.work.businessmag.queryservice.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.BusinessBean;
import com.wys.work.beans.Pager;
import com.wys.work.businessmag.queryservice.IBusinessQueryService;
import com.wys.work.businessmag.queryrepository.IBusinessQueryRepository;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
@Service
public class BusinessQueryServiceImpl implements IBusinessQueryService {

	@Resource
	public IBusinessQueryRepository businessQueryRepositoryImpl;


	@Override
	public Pager findBusiness2Pager(Pager pager, Map parmas){
		return businessQueryRepositoryImpl.findBusiness2Pager(pager, parmas);
	}

	@Override
	public BusinessBean findBusinessById(Long id) {
		// TODO Auto-generated method stub
		return businessQueryRepositoryImpl.findBusinessById(id);
	}

}