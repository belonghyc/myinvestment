package cn.sz.gl.pojo;

import java.io.Serializable;

public class House implements Serializable {
	
	private String houseId;
	private String unit_;
	private Double buildArea;
	private Double useArea;
	private String houseType;
	private String typeDesc;
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getUnit_() {
		return unit_;
	}
	public void setUnit_(String unit_) {
		this.unit_ = unit_;
	}
	public Double getBuildArea() {
		return buildArea;
	}
	public void setBuildArea(Double buildArea) {
		this.buildArea = buildArea;
	}
	public Double getUseArea() {
		return useArea;
	}
	public void setUseArea(Double useArea) {
		this.useArea = useArea;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	
	
	

}
