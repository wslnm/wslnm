package com.wys.work.beans;

import java.io.Serializable;

/**
 * 账务账单表(月表)
 * @author 西柚汁不念诗
 *对应数据库的表格 t_accounting_bill
 */
public class AccountingBillYearBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2462078600691843438L;

	//id
	private Long id;
	
	//账务账号，对应数据库字段user_acc
	private String userAcc;
	
	//费用，对应数据库字段accounting_bill_cost
	private int accountingBillCost;
	
	//月份，对应数据库字段accounting_bill_month
	private int accountingBillMonth;
	
	//支付方式，对应数据库字段accounting_bill_pay_method
	//一共两种支付方式，0代表微信、1代表支付宝、2代表现金
	private int accountingBillCostPayMethod;
	
	//支付状态，对应数据库字段accounting_bill_pay_status  
	//两种支付状态     0代表未支付  1代表支付
	private int accountingBillPayStatus;
	
	//年份  对应数据库字段year
	private int year;

	public AccountingBillYearBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountingBillYearBean(String userAcc, int accountingBillCost, int accountingBillMonth,
			int accountingBillCostPayMethod, int accountingBillPayStatus, int year) {
		super();
		this.userAcc = userAcc;
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

	public String getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
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
		return "AccountingBillYearBean [id=" + id + ", userAcc=" + userAcc + ", accountingBillCost="
				+ accountingBillCost + ", accountingBillMonth=" + accountingBillMonth + ", accountingBillCostPayMethod="
				+ accountingBillCostPayMethod + ", accountingBillPayStatus=" + accountingBillPayStatus + ", year="
				+ year + "]";
	}

	
	

}