package com.wys.work.serverdatemag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.ServerDayBean;

/**
 * @author Administrator
 * @version 1.0
 * @created 14-����-2018 13:07:14
 */
public interface IServerDayHandleRepository extends JpaRepository<ServerDayBean,Long>,JpaSpecificationExecutor<ServerDayBean> {

	

}