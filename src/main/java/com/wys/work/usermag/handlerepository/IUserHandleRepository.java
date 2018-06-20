package com.wys.work.usermag.handlerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wys.work.beans.UserBean;

/**
 * �û��� handle�־ò�
 * @author liuhong
 * @version 1.0
 * @created 14-����-2018 13:07:15
 */
public interface IUserHandleRepository extends JpaRepository<UserBean, Long>,JpaSpecificationExecutor<UserBean> {


}