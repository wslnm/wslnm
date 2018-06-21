package com.wys.work.beans;

public class MessagerBean {

	private boolean status;
	private int code;
	private String information;
	public MessagerBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	
	public MessagerBean(boolean status, int code, String information) {
		super();
		this.status = status;
		this.code = code;
		this.information = information;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "MessagerBean [status=" + status + ", code=" + code + ", information=" + information + "]";
	}
}
