package com.wys.work.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_authority")
public class AuthorityBean implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -4938697782012916103L;


	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="authority_type",length=20)
	private String authorityType;//权限类型  authority_type
	
	@Column(name="authority_code")
	private Integer authorityCode;//权限编码 authority_code
	
	@Column(name="authority_level")
	private Integer authorityLevel;//权限等级 authority_level
	
	@ManyToMany(mappedBy="authoritys")
	private Set<RoleBean> roles;// 多对多  对应 角色 类

	public AuthorityBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthorityType() {
		return authorityType;
	}

	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
	}

	public Integer getAuthorityCode() {
		return authorityCode;
	}

	public void setAuthorityCode(Integer authorityCode) {
		this.authorityCode = authorityCode;
	}

	public Integer getAuthorityLevel() {
		return authorityLevel;
	}

	public void setAuthorityLevel(Integer authorityLevel) {
		this.authorityLevel = authorityLevel;
	}

	public Set<RoleBean> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleBean> roles) {
		this.roles = roles;
	}
	
	
	
	
	

}
