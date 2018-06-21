package com.wys.work.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
/**
 * 管理员表，对应数据库中的表格t_admin
 * @author yangyong
 *用来定义系统中管理员们的属性
 */
@Entity
@Table(name="t_admin")
public class AdminBean implements Serializable {

	
	private static final long serialVersionUID = -2358734321070609546L;
	
	//id 对应数据库字段 id     
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	// 管理员姓名 对应数据库字段admin_name
	@Column(name="admin_name",length=20)
	private String adminName;
	
	//管理员账号 对应数据库字段admin_acc
	@Column(name="admin_acc",length=20)
	private String adminAcc;
	
	//管理员密码  对应数据库字段admin_pwd
	@Column(name="admin_pwd",length=32)
	private String adminPwd;
	
	//管理员电话 对应数据库字段admin_tel
	@Column(name="admin_tel",length=13)
	private String adminTel;
	
	//管理员邮箱  对应数据库字段admin_email
	@Column(name="admin_email",length=20)
	private String adminEmail;
	
	//角色对象  对应当前管理员对应的角色  数据库是外键fk_role_id
	//管理员与角色是多对一的关系
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name="fk_role_id")
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

	@Override
	public String toString() {
		return "AdminBean [id=" + id + ", adminName=" + adminName + ", adminAcc=" + adminAcc + ", adminPwd=" + adminPwd
				+ ", adminTel=" + adminTel + ", adminEmail=" + adminEmail + "]";
	}
	
}
