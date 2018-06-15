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
 * 业务账号对应服务器
 * @author liliuhong
 *
 */
@Entity
@Table(name="t_user_server")
public class UserServerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7679953848606711567L;
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="server_info")
	private String serverInfo;//服务器信息
	
	@Column(name="server_login")
	private Date serverLogin;//登入时间
	
	@Column(name="server_exit_time")
	private Date serverExitTime; //登出时间
	
	@Column(name="server_duration")
	private int serverDuration;//时长
	
	@Column(name="login_acc")
	private String login_acc;//登录账号
	
	@Column(name="cost")
	private int cost;//费用
	
	@Column(name="tariff_name")
	private String tariffName;//资费名称
	
	public UserServerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserServerBean(long id, String serverInfo, Date serverLogin, Date serverExitTime, int serverDuration,
			String login_acc, int cost, String tariffName) {
		super();
		this.id = id;
		this.serverInfo = serverInfo;
		this.serverLogin = serverLogin;
		this.serverExitTime = serverExitTime;
		this.serverDuration = serverDuration;
		this.login_acc = login_acc;
		this.cost = cost;
		this.tariffName = tariffName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getServerInfo() {
		return serverInfo;
	}
	public void setServerInfo(String serverInfo) {
		this.serverInfo = serverInfo;
	}
	public Date getServerLogin() {
		return serverLogin;
	}
	public void setServerLogin(Date serverLogin) {
		this.serverLogin = serverLogin;
	}
	public Date getServerExitTime() {
		return serverExitTime;
	}
	public void setServerExitTime(Date serverExitTime) {
		this.serverExitTime = serverExitTime;
	}
	public int getServerDuration() {
		return serverDuration;
	}
	public void setServerDuration(int serverDuration) {
		this.serverDuration = serverDuration;
	}
	public String getLogin_acc() {
		return login_acc;
	}
	public void setLogin_acc(String login_acc) {
		this.login_acc = login_acc;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getTariffName() {
		return tariffName;
	}
	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}
	@Override
	public String toString() {
		return "UserServerBean [id=" + id + ", serverInfo=" + serverInfo + ", serverLogin=" + serverLogin
				+ ", serverExitTime=" + serverExitTime + ", serverDuration=" + serverDuration + ", login_acc="
				+ login_acc + ", cost=" + cost + ", tariffName=" + tariffName + "]";
	}
	
	
	
}
