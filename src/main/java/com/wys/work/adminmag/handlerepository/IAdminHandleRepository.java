package com.wys.work.adminmag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.AdminBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IAdminHandleRepository extends JpaRepository<AdminBean, Long>,JpaSpecificationExecutor<AdminBean>{

	

	

}