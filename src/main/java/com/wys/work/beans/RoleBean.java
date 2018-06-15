package com.wys.work.beans;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
    
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	@Column(name="role_name",length=20)
	private String roleName;//角色名称
	
	@Column(name="role_type",length=20)
	private String roleType;//角色类型
	
    @ManyToMany
    @JoinTable(name="t_role_authority",joinColumns=@JoinColumn(name="fk_role_id"),inverseJoinColumns=@JoinColumn(name="fk_authority_id"))
    private Set<AuthorityBean> authoritys; //多对多的  权限管理类

	public Set<AuthorityBean> getAuthoritys() {
		return authoritys;
	}

	public void setAuthoritys(Set<AuthorityBean> authoritys) {
		this.authoritys = authoritys;
	}

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
