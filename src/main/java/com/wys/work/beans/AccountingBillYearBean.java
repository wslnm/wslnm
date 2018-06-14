package com.wys.work.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 账务账单表(年表)
 * @author 西柚汁不念诗
 *对应数据库的表格 t_accounting_bill_year
 */

@Entity
@Table(name="t_accounting_bill_year")
public class AccountingBillYearBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6796730602088728549L;
	
	//id 对应数据库字段id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	//用户姓名,对应数据库字段accounting_bill_user_name
	@Column(name="accounting_bill_user_name")
	private String accountingBillUserName;
	
	//总费用，对应数据库字段total_cost
	@Column(name="total_cost")
	private int totalCost;
	
	//年份 ，对应数据库字段year
	@Column(name="year")
	private int year;
	
	//用户的账务账号  对应数据库的字段user_acc
	@Column(name="user_acc")
	private String userAcc;

	

	public AccountingBillYearBean(String accountingBillUserName, int totalCost, int year, String userAcc) {
		super();
		this.accountingBillUserName = accountingBillUserName;
		this.totalCost = totalCost;
		this.year = year;
		this.userAcc = userAcc;
	}

	public AccountingBillYearBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountingBillUserName() {
		return accountingBillUserName;
	}

	public void setAccountingBillUserName(String accountingBillUserName) {
		this.accountingBillUserName = accountingBillUserName;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AccountingBillMonthBean [id=" + id + ", accountingBillUserName=" + accountingBillUserName
				+ ", totalCost=" + totalCost + ", year=" + year + ", userAcc=" + userAcc + "]";
	}
	
	
	
	

}