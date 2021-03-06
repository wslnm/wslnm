package com.wys.work.beans;



import java.io.Serializable;

/**
 * 账务账户（用户）表
 * @author liliuhong
 *
 */
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1127657979634664503L;
	
	private long id;
	
	private String userAcc;//账务账号
	
	private String userPwd;//账务密码
	
	private String userName;//真实姓名
	
	private int userGender;//性别
	
	private String userTel;//联系电话
	
	private String userAddress;//家庭住址
	
	private String userIdcard;//身份证
	
	private int userZipcode;//邮编
	
	private int userQq;//qq
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(long id, String userAcc, String userPwd, String userName, int userGender, String userTel,
			String userAddress, String userIdcard, int userZipcode, int userQq) {
		super();
		this.id = id;
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
