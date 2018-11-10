package cn.appsys.pojo;

import java.util.Date;

public class DataDictionary {
	private Integer id;//主键id
	private String typeCode;//类型编码
	private String typeName;//类型名称
	private Integer valueId;//类型值ID
	private String valueName;//类型值name
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间
	public Integer getId() {
		return id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public Integer getValueId() {
		return valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
