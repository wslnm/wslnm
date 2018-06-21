package com.wys.work.beans;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * 业务账单
 * @author liyiduo
 *
 */
@Entity
@Table(name="t_tariff")
public class BusinessBillBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -549688220842390536L;
	
	//id
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//OS账号(业务账号)
	
	@Column(name="business_bill_os_acc",length=20)
	private String businessBillOsAcc;
	
	//OS账号(业务账号)
	
	@Column(name="business_bill_user_acc",length=20)
	private String businessBillUserAcc;
	
	
	//服务器信息
	
	@Column(name="business_bill_server",length=20)
	private String businessBillServer;
	
	//时长
	@Column(name="business_bill_duration",length=11)
	private int businessBillDuration;
	
	//费用
	@Column(name="business_bill_cost",length=11)
	private int businessBillCost;
	
	//资费套餐
	@Column(name="business_bill_tariff_package",length=20)
	private String businessBillTariffPackage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusinessBillOsAcc() {
		return businessBillOsAcc;
	}

	public void setBusinessBillOsAcc(String businessBillOsAcc) {
		this.businessBillOsAcc = businessBillOsAcc;
	}

	public String getBusinessBillServer() {
		return businessBillServer;
	}

	public void setBusinessBillServer(String businessBillServer) {
		this.businessBillServer = businessBillServer;
	}

	public int getBusinessBillDuration() {
		return businessBillDuration;
	}

	public void setBusinessBillDuration(int businessBillDuration) {
		this.businessBillDuration = businessBillDuration;
	}

	public int getBusinessBillCost() {
		return businessBillCost;
	}

	public void setBusinessBillCost(int businessBillCost) {
		this.businessBillCost = businessBillCost;
	}

	public String getBusinessBillTariffPackage() {
		return businessBillTariffPackage;
	}

	public void setBusinessBillTariffPackage(String businessBillTariffPackage) {
		this.businessBillTariffPackage = businessBillTariffPackage;
	}

	public BusinessBillBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessBillBean(long id, String businessBillOsAcc, String businessBillServer, int businessBillDuration,
			int businessBillCost, String businessBillTariffPackage) {
		super();
		this.id = id;
		this.businessBillOsAcc = businessBillOsAcc;
		this.businessBillServer = businessBillServer;
		this.businessBillDuration = businessBillDuration;
		this.businessBillCost = businessBillCost;
		this.businessBillTariffPackage = businessBillTariffPackage;
	}

	@Override
	public String toString() {
		return "BusinessBillBean [id=" + id + ", businessBillOsAcc=" + businessBillOsAcc + ", businessBillServer="
				+ businessBillServer + ", businessBillDuration=" + businessBillDuration + ", businessBillCost="
				+ businessBillCost + ", businessBillTariffPackage=" + businessBillTariffPackage + "]";
	}
	

}
