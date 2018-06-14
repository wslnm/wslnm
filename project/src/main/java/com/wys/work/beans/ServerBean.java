package com.wys.work.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务器登陆计时类
 * @author dinghao
 *
 */
public class ServerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8017953201990350464L;

	//主键id
	private long id;
	
	//服务器IP
	private String info;
	
	//登陆时间
	private Date loginTime;
	
	//离线时间
	private Date exitTime;
	
	//持续时间 单位：秒
	private int duration;
	
	//对应的业务账户
	private String acc;
	

	public ServerBean() {
		super();
	}
	

	public ServerBean(long id, String info, Date loginTime, Date exitTime, int duration, String acc) {
		super();
		this.id = id;
		this.info = info;
		this.loginTime = loginTime;
		this.exitTime = exitTime;
		this.duration = duration;
		this.acc = acc;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public Date getLoginTime() {
		return loginTime;
	}


	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}


	public Date getExitTime() {
		return exitTime;
	}


	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getAcc() {
		return acc;
	}


	public void setAcc(String acc) {
		this.acc = acc;
	}


	@Override
	public String toString() {
		return "ServerBean [id=" + id + ", info=" + info + ", loginTime=" + loginTime + ", exitTime=" + exitTime
				+ ", duration=" + duration + ", acc=" + acc + "]";
	}
	
	
}
