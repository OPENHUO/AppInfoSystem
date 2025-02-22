package cn.appsys.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
	private Integer id;//主键id
	private String softwareName;//软件名称
	private String APKName;//APK名称
	private String supportROM;//支持ROM
	private String interfaceLanguage;//界面语言
	private Date updateDate;//更新日期
	private BigDecimal softwareSize;//软件大小（单位：M）
	private Integer devId;//开发者id（来源于：dev_user表的开发者id）
	private String appInfo;//应用简介
	private Integer status;//app状态id（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
	private Date onSaleDate;//上架时间
	private Date offSaleDate;//下架时间
	private Integer categoryLevel3;//所属三级分类id（来源于：data_dictionary）
	private Integer downloads;//下载量（单位：次）
	private Integer flatformId;//app所属平台id（来源于：data_dictionary，1 手机 2 平板 3 通用）
	private Integer createdBy;//创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;//更新时间
	
	private String statusName;//app状态名称
	private String flatformName;//app所属平台名称
	private String categoryLevel3Name;//所属三级分类名称
	private String devName;//开发者名称
	
	private Integer categoryLevel1;//所属一级分类id（来源于：data_dictionary）
	private Integer categoryLevel2;//所属二级分类id（来源于：data_dictionary）
	
	private String categoryLevel1Name;//所属一级分类名称
	private String categoryLevel2Name;//所属二级分类名称
	
	private String logoPicPath;//LOGO图片URL路径
	private String logoLocPath;//LOGO图片的服务器存储路径
	
	private Integer versionId;//最新的版本id
	private String versionNo;//最新的版本号
	public Integer getId() {
		return id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public BigDecimal getSoftwareSize() {
		return softwareSize;
	}
	public Integer getDevId() {
		return devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public Integer getStatus() {
		return status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public Integer getCategoryLevel3() {
		return categoryLevel3;
	}
	public Integer getDownloads() {
		return downloads;
	}
	public Integer getFlatformId() {
		return flatformId;
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
	public String getStatusName() {
		return statusName;
	}
	public String getFlatformName() {
		return flatformName;
	}
	public String getCategoryLevel3Name() {
		return categoryLevel3Name;
	}
	public String getDevName() {
		return devName;
	}
	public Integer getCategoryLevel1() {
		return categoryLevel1;
	}
	public Integer getCategoryLevel2() {
		return categoryLevel2;
	}
	public String getCategoryLevel1Name() {
		return categoryLevel1Name;
	}
	public String getCategoryLevel2Name() {
		return categoryLevel2Name;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public Integer getVersionId() {
		return versionId;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setSoftwareSize(BigDecimal softwareSize) {
		this.softwareSize = softwareSize;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public void setCategoryLevel3(Integer categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}
	public void setFlatformId(Integer flatformId) {
		this.flatformId = flatformId;
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
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public void setFlatformName(String flatformName) {
		this.flatformName = flatformName;
	}
	public void setCategoryLevel3Name(String categoryLevel3Name) {
		this.categoryLevel3Name = categoryLevel3Name;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public void setCategoryLevel1(Integer categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public void setCategoryLevel2(Integer categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public void setCategoryLevel1Name(String categoryLevel1Name) {
		this.categoryLevel1Name = categoryLevel1Name;
	}
	public void setCategoryLevel2Name(String categoryLevel2Name) {
		this.categoryLevel2Name = categoryLevel2Name;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	
}
