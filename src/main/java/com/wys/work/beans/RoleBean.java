package com.wys.work.beans;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * 角色管理表
 * @author yangyong
 *
 */

@Entity
@Table(name="t_role")
public class RoleBean implements Serializable {

	private static final long serialVersionUID = 5108288455364314017L;

	private Long id;
	
	private String roleName;//角色名称
	
	private String roleType;//角色类型

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "RoleBean [id=" + id + ", roleName=" + roleName + ", roleType=" + roleType + "]";
	}
	
}
