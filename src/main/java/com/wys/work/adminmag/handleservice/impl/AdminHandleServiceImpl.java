package com.wys.work.adminmag.handleservice.impl;

import com.wys.work.beans.AdminBean;
import com.wys.work.adminmag.handleservice.IAdminHandleService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.adminmag.handlerepository.IAdminHandleRepository;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */

@Service
public class AdminHandleServiceImpl implements IAdminHandleService {

	@Resource
	private IAdminHandleRepository adminHandleRepository;

	@Override
	public void deleteAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		adminHandleRepository.delete(admin);
	}

	@Override
	public void saveAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		adminHandleRepository.save(admin);
	}

	@Override
	public void updateAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		adminHandleRepository.saveAndFlush(admin);
	}

	@Override
	public AdminBean findById(Long id) {
		// TODO Auto-generated method stub
		return adminHandleRepository.findOne(id);
	}

}