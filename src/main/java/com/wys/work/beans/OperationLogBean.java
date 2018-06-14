package com.wys.work.beans;



import java.io.Serializable;
/**
 * 操作日志
 * @author liyiduo
 *
 */
public class OperationLogBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9126228385214091788L;
	
	//id
	
	private long id;
	
	//管理员名称
	
	private String adminName;
		
	//角色名称
		
	private String roleName;
	
	//操作时间
		
	private String operationDate;
	
	//系统模块
	
	private String systemMod;
		
	//具体操作
		
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

	public String getSystemMod() {
		return systemMod;
	}

	public void setSystemMod(String systemMod) {
		this.systemMod = systemMod;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public OperationLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OperationLogBean(long id, String adminName, String roleName, String operationDate, String systemMod,
			String operation) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.roleName = roleName;
		this.operationDate = operationDate;
		this.systemMod = systemMod;
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "OperationLogBean [id=" + id + ", adminName=" + adminName + ", roleName=" + roleName + ", operationDate="
				+ operationDate + ", systemMod=" + systemMod + ", operation=" + operation + "]";
	}
	
	

}
