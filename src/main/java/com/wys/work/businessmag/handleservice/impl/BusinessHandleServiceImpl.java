package com.wys.work.businessmag.handleservice.impl;

import com.wys.work.beans.BusinessBean;
import com.wys.work.businessmag.handleservice.IBusinessHandleService;
import com.wys.work.businessmag.handlerepository.IBusinessHandleRepository;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.AdminBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Service
public class BusinessHandleServiceImpl implements IBusinessHandleService {

	@Resource
	public IBusinessHandleRepository businessHandleRepository;

	@Override
	public void deleteBusiness(BusinessBean business) {
		// TODO Auto-generated method stub
		businessHandleRepository.delete(business);
	}

	@Override
	public void saveBusiness(BusinessBean business) {
		// TODO Auto-generated method stub
		businessHandleRepository.save(business);
	}

	@Override
	public void updateBusiness(BusinessBean business) {
		// TODO Auto-generated method stub
		businessHandleRepository.saveAndFlush(business);
	}

}