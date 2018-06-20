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
 * 操作日志
 * @author liyiduo
 *
 */
@Table(name="t_operation_log")
@Entity
public class OperationLogBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9126228385214091788L;
	
	//id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//管理员名称1.0
	@Column(name="admin_name")
	private String adminName;
		
	//角色名称1.0
	@Column(name="role_name")	
	private Integer roleName;
	
	//操作时间1.0
	@Column(name="operation_date")	
	private Date operationDate;
	
	//系统模块1.0
	@Column(name="system_mod")
	private Integer systemMod;
		
	//具体操作1.0
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

	public Integer getRoleName() {
		return roleName;
	}

	public void setRoleName(Integer roleName) {
		this.roleName = roleName;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public Integer getSystemMod() {
		return systemMod;
	}

	public void setSystemMod(Integer systemMod) {
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

	public OperationLogBean(long id, String adminName, Integer roleName, Date operationDate, Integer systemMod,
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
