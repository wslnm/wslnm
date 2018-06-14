package com.wys.work.beans;



import java.io.Serializable;
/**
 * 登陆日志
 * @author liyiduo
 *
 */
public class LoginLogBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3085463210742039512L;
	
	//id
	
	private long id;
	
	//管理员名称
	
	private String adminName;
	
	//角色名称
	
	private String roleName;
	
	//操作时间
	
	private String operationDate;
	
	//IP地址
	
	private String ip;
	
	//操作(登录/退出)
	
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
