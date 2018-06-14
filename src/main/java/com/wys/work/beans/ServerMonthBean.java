package com.wys.work.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 一个月使用服务时长类
 * @author dinghao
 *
 */
@Entity
@Table(name="t_server_month")
public class ServerMonthBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1868648815961395523L;
	
	//主键id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//月份
	@Column(name="month")
	private int month;
	
	//月份
	@Column(name="year")
	private int year;
	
	//总计服务时长
	@Column(name="total_time")
	private int totalTime;
	
	//服务器名称（IP）
	@Column(name="service_name")
	private String name;
	
	//对应的业务账号
	@Column(name="user_acc")
	private String acc;

	public ServerMonthBean() {
		super();
	}

	public ServerMonthBean(long id, int month, int year, int totalTime, String name, String acc) {
		super();
		this.id = id;
		this.month = month;
		this.year = year;
		this.totalTime = totalTime;
		this.name = name;
		this.acc = acc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	@Override
	public String toString() {
		return "ServiceMonthBean [id=" + id + ", month=" + month + ", year=" + year + ", totalTime=" + totalTime
				+ ", name=" + name + ", acc=" + acc + "]";
	}

	
}
