package com.wys.work.beans;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 账务账户（用户）表
 * @author liliuhong
 *
 */
@Entity
@Table(name="t_user")
public class UserBean implements Serializable {

	
	private static final long serialVersionUID = 1127657979634664503L;
	 
	@Id 
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="user_acc")
	private String userAcc;//账务账号
	
	@Column(name="user_pwd")
	private String userPwd;//账务密码
	
	@Column(name="user_name")
	private String userName;//真实姓名
	
	@Column(name="user_gender")
	private int userGender;//性别 
	
	@Column(name="user_tel")
	private String userTel;//联系电话
	
	@Column(name="user_address")
	private String userAddress;//家庭住址
	
	@Column(name="user_idcard")
	private String userIdcard;//身份证
	
	@Column(name="user_zipcode")
	private int userZipcode;//邮编
	
	@Column(name="user_qq")
	private int userQq;//qq
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserBean(String userAcc, String userPwd, String userName, int userGender, String userTel, String userAddress,
			String userIdcard, int userZipcode, int userQq) {
		super();
		this.userAcc = userAcc;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userGender = userGender;
		this.userTel = userTel;
		this.userAddress = userAddress;
		this.userIdcard = userIdcard;
		this.userZipcode = userZipcode;
		this.userQq = userQq;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserGender() {
		return userGender;
	}

	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserIdcard() {
		return userIdcard;
	}

	public void setUserIdcard(String userIdcard) {
		this.userIdcard = userIdcard;
	}

	public int getUserZipcode() {
		return userZipcode;
	}

	public void setUserZipcode(int userZipcode) {
		this.userZipcode = userZipcode;
	}

	public int getUserQq() {
		return userQq;
	}

	public void setUserQq(int userQq) {
		this.userQq = userQq;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userAcc=" + userAcc + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", userGender=" + userGender + ", userTel=" + userTel + ", userAddress=" + userAddress
				+ ", userIdcard=" + userIdcard + ", userZipcode=" + userZipcode + ", userQq=" + userQq + "]";
	}
	
	
	

}
