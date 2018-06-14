package com.wys.work.beans;

import java.io.Serializable;
/**
 * 管理员表，对应数据库中的表格t_admin
 * @author 西柚汁不念诗
 *用来定义系统中管理员们的属性
 */
public class AdminBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2358734321070609546L;
	
	//id 对应数据库字段 id
	private Long id;
	
	// 管理员姓名 对应数据库字段admin_name
	private String adminName;
	
	//管理员账号 对应数据库字段admin_acc
	private String adminAcc;
	
	//管理员密码  对应数据库字段admin_pwd
	private String adminPwd;
	
	//管理员电话 对应数据库字段admin_tel
	private String adminTel;
	
	//管理员邮箱  对应数据库字段admin_email
	private String adminEmail;
	
	//角色对象  对应当前管理员对应的角色  数据库是外键fk_role_id
	//管理员与角色是多对一的关系
	private RoleBean role;

	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminBean(String adminName, String adminAcc, String adminPwd, String adminTel, String adminEmail,
			RoleBean role) {
		super();
		this.adminName = adminName;
		this.adminAcc = adminAcc;
		this.adminPwd = adminPwd;
		this.adminTel = adminTel;
		this.adminEmail = adminEmail;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAcc() {
		return adminAcc;
	}

	public void setAdminAcc(String adminAcc) {
		this.adminAcc = adminAcc;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminTel() {
		return adminTel;
	}

	public void setAdminTel(String adminTel) {
		this.adminTel = adminTel;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AdminBean [id=" + id + ", adminName=" + adminName + ", adminAcc=" + adminAcc + ", adminPwd=" + adminPwd
				+ ", adminTel=" + adminTel + ", adminEmail=" + adminEmail + "]";
	}
	
	

}
