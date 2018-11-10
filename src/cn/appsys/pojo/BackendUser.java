package cn.appsys.pojo;

import java.util.Date;

public class BackendUser {
	private Integer id;//主键id
	private String userCode;//用户编码（登录账号）
	private String userName;//用户名称
	private String userPassword;//用户密码
	private Integer userType;//用户角色类型id
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间
	private String userTypeName;//用户角色类型名称
	public Integer getId() {
		return id;
	}
	public String getUserCode() {
		return userCode;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public Integer getUserType() {
		return userType;
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
	public String getUserTypeName() {
		return userTypeName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
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
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

}
