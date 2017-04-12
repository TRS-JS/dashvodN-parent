package org.dashvodN.module;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DASHVOD_RANGETOP_STAT")
public class RangeTop {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * 播放次数
	 */
	@Column(name="RANGETOP_STAT_PLAYTIMES")
	private Long playTimes;
	
	/**
	 * 播放率
	 */
	@Column(name="RANGETOP_STAT_PLAYRATE")
	private Long playRate;
	/**
	 * 地域
	 */
	@Column(name="RANGETOP_STAT_REGION")
	private String region;
	/**
	 * 机型
	 */
	@Column(name="RANGETOP_STAT_MODEL")
	private String model;
	/**
	 * 频道
	 */
	@Column(name="RANGETOP_STAT_CHANNEL")
	private String channel;
	/**
	 * 付费内容/免费内容  0/1
	 */
	@Column(name="RANGETOP_STAT_THINGTYPE")
	private Integer thingType;
	
	/**
	 * 时间
	 */
	@Column(name="RANGETOP_STAT_TIME")
	private Date time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPlayTimes() {
		return playTimes;
	}

	public void setPlayTimes(Long playTimes) {
		this.playTimes = playTimes;
	}

	public Long getPlayRate() {
		return playRate;
	}

	public void setPlayRate(Long playRate) {
		this.playRate = playRate;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getThingType() {
		return thingType;
	}

	public void setThingType(Integer thingType) {
		this.thingType = thingType;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
}
