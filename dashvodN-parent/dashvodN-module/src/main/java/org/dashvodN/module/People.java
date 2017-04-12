package org.dashvodN.module;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 付费用户与免费用户的对比：以条形式图来表达，时间选择为周，横坐标为指标选择（指标—终端（机型），栏目（二级栏目），地域），纵坐标为数量。
 * @author Administrator
 *
 */
@Entity
@Table(name="DASHVOD_PEOPLE_STAT")
public class People {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * 用户类别   0 免费  1 收费
	 */
	@Column(name="PEOPLE_STAT_TYPE")
	private Integer userType;
	
	/**
	 * 用户时间  暂时不确定这个时间是指注册时间 还是指 其他时间 暂定注册时间
	 */
	@Column(name="PEOPLE_STAT_TIME")
	private Date userTime;
	
	/**
	 * 机型(系列)
	 */
	@Column(name="PEOPLE_STAT_MODEL")
	private String modelType;
	
	/**
	 * 机型具体型号,可能多个
	 */
	@Column(name="PEOPLE_STAT_SUBMODEL")
	private String subModel;
	
	/**
	 * 栏目  涉及到的栏目
	 */
	@Column(name="PEOPLE_STAT_TARCHANNELS")
	private String targetChannels;
	
	/**
	 * 地域
	 */
	@Column(name="PEOPLE_STAT_REGION")
	private String userRegion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Date getUserTime() {
		return userTime;
	}

	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getSubModel() {
		return subModel;
	}

	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}

	public String getTargetChannels() {
		return targetChannels;
	}

	public void setTargetChannels(String targetChannels) {
		this.targetChannels = targetChannels;
	}

	public String getUserRegion() {
		return userRegion;
	}

	public void setUserRegion(String userRegion) {
		this.userRegion = userRegion;
	}
	
	
	
}
