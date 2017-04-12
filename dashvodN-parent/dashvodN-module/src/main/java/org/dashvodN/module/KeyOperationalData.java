package org.dashvodN.module;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 重点运营数据
 * 整体把握VOD的用户情况，以数字形式体现，
 * 数据指标——
 * 累计用户总数，累计播放总数，
 * 昨日，7日，月活跃用户数，
 * 昨日播放次数，
 * 昨日平均观看时长，
 * 总付费用户数，
 * 昨日付费用户数，
 * 付费率
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name="DASHVOD_KEYOPTDATA_STAT")
public class KeyOperationalData {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 展示时间  单位/天
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8" )
	@Column(name="KEYOPTDATA_STAT_TIME")
	private Date time;
	
	/**
	 * 用户总数
	 */
	@Column(name="KEYOPTDATA_STAT_TIME")
	private Long totalPeople;
	
	/**
	 * 累计播放总数
	 */
	@Column(name="KEYOPTDATA_STAT_TOTALPLAY")
	private Long totalPlay;
	
	/**
	 * 昨日活跃用户数
	 */
	@Column(name="KEYOPTDATA_STAT_YESTERDAY_ACTPEOPLE")
	private Long yesterdayActivePeople;
	
	/**
	 * 7天活跃用户数
	 */
	@Column(name="KEYOPTDATA_STAT_WEEK_ACTPEOPLE")
	private Long weekActivePeople;
	/**
	 * 月活跃用户数
	 */
	@Column(name="KEYOPTDATA_STAT_MONTH_ACTPEOPLE")
	private Long monthActivePeople;
	
	/**
	 * 昨日播放次数
	 */
	@Column(name="KEYOPTDATA_STAT_YESTERDAY_PLAY")
	private Long yesterdayPlay;
	
	/**
	 * 昨日平均观看时长
	 */
	@Column(name="KEYOPTDATA_STAT_YESTERDAY_PER_DURTIME")
	private Long yesterdayPerDurTime;
	
	/**
	 * 总付费用户数 目前为0
	 */
	@Column(name="KEYOPTDATA_STAT_TOTAL_PAID")
	private Long totalPaid;
	
	/**
	 * 付费率
	 */
	@Column(name="KEYOPTDATA_STAT_PAY_RATE")
	private Double payRate;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(Long totalPeople) {
		this.totalPeople = totalPeople;
	}

	public Long getTotalPlay() {
		return totalPlay;
	}

	public void setTotalPlay(Long totalPlay) {
		this.totalPlay = totalPlay;
	}

	public Long getYesterdayActivePeople() {
		return yesterdayActivePeople;
	}

	public void setYesterdayActivePeople(Long yesterdayActivePeople) {
		this.yesterdayActivePeople = yesterdayActivePeople;
	}

	public Long getWeekActivePeople() {
		return weekActivePeople;
	}

	public void setWeekActivePeople(Long weekActivePeople) {
		this.weekActivePeople = weekActivePeople;
	}

	public Long getMonthActivePeople() {
		return monthActivePeople;
	}

	public void setMonthActivePeople(Long monthActivePeople) {
		this.monthActivePeople = monthActivePeople;
	}

	public Long getYesterdayPlay() {
		return yesterdayPlay;
	}

	public void setYesterdayPlay(Long yesterdayPlay) {
		this.yesterdayPlay = yesterdayPlay;
	}

	public Long getYesterdayPerDurTime() {
		return yesterdayPerDurTime;
	}

	public void setYesterdayPerDurTime(Long yesterdayPerDurTime) {
		this.yesterdayPerDurTime = yesterdayPerDurTime;
	}

	public Long getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(Long totalPaid) {
		this.totalPaid = totalPaid;
	}

	public Double getPayRate() {
		return payRate;
	}

	public void setPayRate(Double payRate) {
		this.payRate = payRate;
	}
	
	
	
}
