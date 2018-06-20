package com.wys.work.beans;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 登陆日志
 * @author liyiduo
 * 
 */
@Table(name="t_login_log")
@Entity
public class LoginLogBean implements Serializable {

	/**
	 *  
	 */
	private static final long serialVersionUID = 3085463210742039512L;
	
	//id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//管理员名称 1.0
	@Column(name="admin_name")
	private String adminName;
	
	//角色名称
	@Column(name="role_name")
	private String roleName;
	 
	//操作时间1.0
	@Column(name="operation_date")
	private Date operationDate;
	
	//IP地址1.0
	@Column(name="ip")
	private String ip;
	
	//操作(登录0/退出1)类型 1.0
	@Column(name="operation")
	private Integer operation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer  getOperation() {
		return operation;
	}

	public void setOperation(Integer  operation) {
		this.operation = operation;
	}

	public LoginLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginLogBean(long id, String adminName, String roleName, Date operationDate, String ip, Integer  operation) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.roleName = roleName;
		this.operationDate = operationDate;
		this.ip = ip;
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "LoginLogBean [id=" + id + ", adminName=" + adminName + ", roleName=" + roleName + ", operationDate="
				+ operationDate + ", ip=" + ip + ", operation=" + operation + "]";
	}
	

}
