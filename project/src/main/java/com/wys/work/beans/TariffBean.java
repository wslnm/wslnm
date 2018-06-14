package com.wys.work.beans;



import java.io.Serializable;

/**
 * 资费类
 * @author liliuhong
 *
 */
public class TariffBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8182717495869850432L;
	
	private long id;
	
	private String tariffName;//资费名
	
	private int tariffType;//资费类型
	
	private int basicTime;//基本时长
	
	private int basicCost;//基本费用
	
	private int unitCost;//单位费用
	
	private String tariffDirections;//资费说明
	
	private int tariffStatus;//资费状态
	
	public TariffBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TariffBean(int id, String tariffName, int tariffType, int basicTime, int basicCost, int unitCost,
			String tariffDirections, int tariffStatus) {
		super();
		this.id = id;
		this.tariffName = tariffName;
		this.tariffType = tariffType;
		this.basicTime = basicTime;
		this.basicCost = basicCost;
		this.unitCost = unitCost;
		this.tariffDirections = tariffDirections;
		this.tariffStatus = tariffStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTariffName() {
		return tariffName;
	}

	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}

	public int getTariffType() {
		return tariffType;
	}

	public void setTariffType(int tariffType) {
		this.tariffType = tariffType;
	}

	public int getBasicTime() {
		return basicTime;
	}

	public void setBasicTime(int basicTime) {
		this.basicTime = basicTime;
	}

	public int getBasicCost() {
		return basicCost;
	}

	public void setBasicCost(int basicCost) {
		this.basicCost = basicCost;
	}

	public int getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}

	public String getTariffDirections() {
		return tariffDirections;
	}

	public void setTariffDirections(String tariffDirections) {
		this.tariffDirections = tariffDirections;
	}

	public int getTariffStatus() {
		return tariffStatus;
	}

	public void setTariffStatus(int tariffStatus) {
		this.tariffStatus = tariffStatus;
	}

	@Override
	public String toString() {
		return "TariffBean [id=" + id + ", tariffName=" + tariffName + ", tariffType=" + tariffType + ", basicTime="
				+ basicTime + ", basicCost=" + basicCost + ", unitCost=" + unitCost + ", tariffDirections="
				+ tariffDirections + ", tariffStatus=" + tariffStatus + "]";
	}
	
	

}
