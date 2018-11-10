package cn.appsys.pojo;

import java.util.Date;

public class DevUser {
	private Integer id;//主键id
	private String devCode;//开发者帐号(系统登录账号)
	private String devName;//开发者名称
	private String devPassword;//开发者密码
	private String devEmail;//开发者邮箱
	private String devInfo;	//开发者简介
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间
	public Integer getId() {
		return id;
	}
	public String getDevCode() {
		return devCode;
	}
	public String getDevName() {
		return devName;
	}
	public String getDevPassword() {
		return devPassword;
	}
	public String getDevEmail() {
		return devEmail;
	}
	public String getDevInfo() {
		return devInfo;
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
	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}
	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}
	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
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
