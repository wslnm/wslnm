package com.wys.work.beans;


import java.io.Serializable;

/**
 * 一年使用服务时长类
 * @author dinghao
 *
 */
public class ServerYearBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -739952080644477218L;
	
	//主键id
	private long id;
	
	//年份
	private int year;
	
	//总计服务时长
	private int totalTime;
	
	//服务器名称（IP）
	private String name;
	
	//对应的业务账号
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
