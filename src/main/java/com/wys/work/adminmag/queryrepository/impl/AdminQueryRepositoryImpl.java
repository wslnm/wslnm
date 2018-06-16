package com.wys.work.adminmag.queryrepository.impl;

import com.wys.work.beans.AdminBean;
import com.wys.work.beans.Pager;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wys.work.adminmag.mapper.AdminMapper;
import com.wys.work.adminmag.queryrepository.IAdminQueryRepository;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:12
 */


@Repository
public class AdminQueryRepositoryImpl implements IAdminQueryRepository {

	@Resource
	public AdminMapper am;

	@Override
	public Pager findAdmins2Pager(Map parmas, Pager pager) {
		// TODO Auto-generated method stub
		Long a = am.findAdmin2Count(parmas);
		int totalRows = a.intValue();
		List<AdminBean> datas = am.findAdmin2List(parmas);
		pager.setDatas(datas);
		pager.setTotalRows(totalRows);
		return pager;
	}

	@Override
	public AdminBean findAdminById(Long id) {
		// TODO Auto-generated method stub
		return am.findAdminById(id);
	}

	@Override
	public AdminBean login(String adminAcc, String adminPwd) {
		// TODO Auto-generated method stub
		return am.login(adminAcc, adminPwd);
	}

}