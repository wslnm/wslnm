package com.wys.work.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 * 账务账单表(月表)
 * @author 西柚汁不念诗
 *对应数据库的表格 t_accounting_bill
 */
@Entity
@Table(name="t_accounting_bill")
public class AccountingBillMonthBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2462078600691843438L;

	//id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private Long id;
	
	//费用，对应数据库字段accounting_bill_cost
	@Column(name="accounting_bill_cost")
	private int accountingBillCost;
	
	//月份，对应数据库字段accounting_bill_month
	@Column(name="accounting_bill_month")
	private int accountingBillMonth;
	
	//支付方式，对应数据库字段accounting_bill_pay_method
	//一共两种支付方式，0代表微信、1代表支付宝、2代表现金
	@Column(name="accounting_bill_pay_method")
	private int accountingBillCostPayMethod;
	
	//支付状态，对应数据库字段accounting_bill_pay_status  
	//两种支付状态     0代表未支付  1代表支付
	@Column(name="accounting_bill_pay_status")
	private int accountingBillPayStatus;
	
	//年份  对应数据库字段year
	@Column(name="year")
	private int year;
	
	@Transient
	private UserBean user;

	public AccountingBillMonthBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountingBillMonthBean(String userAcc, int accountingBillCost, int accountingBillMonth,
			int accountingBillCostPayMethod, int accountingBillPayStatus, int year) {
		super();
		this.accountingBillCost = accountingBillCost;
		this.accountingBillMonth = accountingBillMonth;
		this.accountingBillCostPayMethod = accountingBillCostPayMethod;
		this.accountingBillPayStatus = accountingBillPayStatus;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountingBillCost() {
		return accountingBillCost;
	}

	public void setAccountingBillCost(int accountingBillCost) {
		this.accountingBillCost = accountingBillCost;
	}

	public int getAccountingBillMonth() {
		return accountingBillMonth;
	}

	public void setAccountingBillMonth(int accountingBillMonth) {
		this.accountingBillMonth = accountingBillMonth;
	}

	public int getAccountingBillCostPayMethod() {
		return accountingBillCostPayMethod;
	}

	public void setAccountingBillCostPayMethod(int accountingBillCostPayMethod) {
		this.accountingBillCostPayMethod = accountingBillCostPayMethod;
	}

	public int getAccountingBillPayStatus() {
		return accountingBillPayStatus;
	}

	public void setAccountingBillPayStatus(int accountingBillPayStatus) {
		this.accountingBillPayStatus = accountingBillPayStatus;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AccountingBillYearBean [id=" + id + ", accountingBillCost="
				+ accountingBillCost + ", accountingBillMonth=" + accountingBillMonth + ", accountingBillCostPayMethod="
				+ accountingBillCostPayMethod + ", accountingBillPayStatus=" + accountingBillPayStatus + ", year="
				+ year + "]";
	}

	
	

}