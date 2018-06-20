package com.wys.work.businessmag.handlerepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.BusinessBean;

/**
 * @author yangyong
 * @version 1.0
 * @created 14-����-2018 13:07:13
 */
public interface IBusinessHandleRepository extends JpaRepository<BusinessBean, Long>,JpaSpecificationExecutor<BusinessBean>{

	

}