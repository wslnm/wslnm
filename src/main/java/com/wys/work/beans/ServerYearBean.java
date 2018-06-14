package com.wys.work.beans;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 一年使用服务时长类
 * @author dinghao
 *
 */
@Entity
@Table(name="t_server_year")
public class ServerYearBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -739952080644477218L;
	
	//主键id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//年份
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

	public ServerYearBean() {
		super();
	}

	public ServerYearBean(long id, int year, int totalTime, String name, String acc) {
		super();
		this.id = id;
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
		return "ServerYearBean [id=" + id + ", year=" + year + ", totalTime=" + totalTime + ", name=" + name + ", acc="
				+ acc + "]";
	}
	
	
}
