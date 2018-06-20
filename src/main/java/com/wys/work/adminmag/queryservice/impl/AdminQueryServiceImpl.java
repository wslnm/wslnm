package com.wys.work.adminmag.queryservice.impl;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;
import com.wys.work.adminmag.queryservice.IAdminQueryService;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wys.work.adminmag.queryrepository.IAdminQueryRepository;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */

@Service
public class AdminQueryServiceImpl implements IAdminQueryService {

	@Resource
	public IAdminQueryRepository adminQueryRepositoryImpl;
	
	@Override
	public Pager findAdmins2Pager(Map parmas, Pager pager) {
		// TODO Auto-generated method stub
		return adminQueryRepositoryImpl.findAdmins2Pager(parmas, pager);
	}

	@Override
	public AdminBean findAdminById(Long id) {
		// TODO Auto-generated method stub
		return adminQueryRepositoryImpl.findAdminById(id);
	}

	@Override
	public AdminBean login(String adminAcc, String adminPwd) {
		// TODO Auto-generated method stub
		return adminQueryRepositoryImpl.login(adminAcc, adminPwd);
	}

}