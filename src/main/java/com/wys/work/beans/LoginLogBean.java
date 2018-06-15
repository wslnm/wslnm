package com.wys.work.beans;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
	private long id;
	
	//管理员名称
	@Column(name="admin_name")
	private String adminName;
	
	//角色名称
	@Column(name="role_name")
	private String roleName;
	 
	//操作时间
	@Column(name="operation_date")
	private String operationDate;
	
	//IP地址
	@Column(name="ip")
	private String ip;
	
	//操作(登录/退出)
	@Column(name="operation")
	private String operation;

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

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public LoginLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginLogBean(long id, String adminName, String roleName, String operationDate, String ip, String operation) {
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
