package com.wys.work.businessbillmag.handleservice.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.beans.BusinessBillBean;
import com.wys.work.businessbillmag.handlerepository.IBusinessBillHandleRepository;
import com.wys.work.businessbillmag.handleservice.IBusinessBillHandleService;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */
@Service
public class BusinessBillHandleServiceImpl implements IBusinessBillHandleService {

	@Resource
	public IBusinessBillHandleRepository businessBillHandleRepositoryImpl;

	/**
	 * 
	 * @param businessBill
	 */
	public void deleteBusinessBill(BusinessBillBean businessBill){
		businessBillHandleRepositoryImpl.delete(businessBill);
	}

	/**
	 * 
	 * @param businessBill
	 */
	public void saveBusinessBill(BusinessBillBean businessBill){
		businessBillHandleRepositoryImpl.save(businessBill);
	}

	/**
	 * 
	 * @param businessBill
	 */
	public void updateBusinessBill(BusinessBillBean businessBill){
		businessBillHandleRepositoryImpl.saveAndFlush(businessBill);
	}

}