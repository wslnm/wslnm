package com.wys.work.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 服务器登陆计时类
 * @author dinghao
 *
 */
@Entity
@Table(name="t_server")
public class ServerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8017953201990350464L;

	//主键id
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	//服务器IP
	@Column(name="server_info")
	private String info;
	
	//登陆时间
	@Column(name="server_login_time")
	private Date loginTime;
	
	//离线时间
	@Column(name="server_exit_time")
	private Date exitTime;
	
	//持续时间 单位：秒
	@Column(name="server_duration")
	private int duration;
	
	//对应的业务账户
	@Column(name="login_acc")
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
