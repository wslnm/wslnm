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
 * 业务账户
 * @author liyiduo
 *
 */

@Entity
@Table(name="t_business")
public class BusinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7369975425741775321L;
	
	//id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//业务账号
	@Column(name="business_acc",length=20)
	private String businessAcc;
	
	//业务账号密码
	@Column(name="business_pwd",length=32)
	private String businessPwd;
	
	//业务IP地址
	@Column(name="business_ip",length=30)
	private String businessIp;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name="fk_tariff_id")
	private TariffBean tariffBean;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name="fk_user_id")
	private UserBean userBean;
	
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

	
	public TariffBean getTariffBean() {
		return tariffBean;
	}

	public void setTariffBean(TariffBean tariffBean) {
		this.tariffBean = tariffBean;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
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
