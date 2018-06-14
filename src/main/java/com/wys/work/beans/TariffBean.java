package com.wys.work.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 资费类
 * @author liliuhong
 *
 */
@Entity
@Table(name="t_tariff")
public class TariffBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8182717495869850432L;
	
	@Id
	@Column
	@GenericGenerator(name="hibernate.id",strategy="identity")
	@GeneratedValue(generator="hibernate.id")
	private long id;
	
	@Column(name="tariff_name",length=20)
	private String tariffName;//资费名
	
	@Column(name="tariff_type",length=11)
	private int tariffType;//资费类型
	
	@Column(name="basic_time",length=11)
	private int basicTime;//基本时长
	
	@Column(name="basic_cost",length=11)
	private int basicCost;//基本费用
	
	@Column(name="unit_cost",length=11)
	private int unitCost;//单位费用
	
	@Column(name="tariff_directions",length=20)
	private String tariffDirections;//资费说明
	
	@Column(name="tariff_status",length=11)
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
