package com.wys.work.beans;



import java.io.Serializable;

/**
 * 业务账户
 * @author liyiduo
 *
 */
public class BusinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7369975425741775321L;
	
	//id
	
	private long id;
	
	//业务账号
	
	private String businessAcc;
	
	//业务账号密码
	
	private String businessPwd;
	
	//业务IP地址
	
	private String businessIp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusinessAcc() {
		return businessAcc;
	}

	public void setBusinessAcc(String businessAcc) {
		this.businessAcc = businessAcc;
	}

	public String getBusinessPwd() {
		return businessPwd;
	}

	public void setBusinessPwd(String businessPwd) {
		this.businessPwd = businessPwd;
	}

	public String getBusinessIp() {
		return businessIp;
	}

	public void setBusinessIp(String businessIp) {
		this.businessIp = businessIp;
	}

	public BusinessBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessBean(long id, String businessAcc, String businessPwd, String businessIp) {
		super();
		this.id = id;
		this.businessAcc = businessAcc;
		this.businessPwd = businessPwd;
		this.businessIp = businessIp;
	}

	@Override
	public String toString() {
		return "BusinessBean [id=" + id + ", businessAcc=" + businessAcc + ", businessPwd=" + businessPwd
				+ ", businessIp=" + businessIp + "]";
	}
	
}
