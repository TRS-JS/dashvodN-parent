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
 * 数据整体趋势： 表现形式—折线图， 横坐标时间轴（以天为单位，一周为周期），
 * 纵坐标数值轴。新增用户，活跃用户，总点播次数，总付费用户，平均观看时长，累计用户数，平均点播次数，当日实时UV，当日实时VV。
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "DASHVOD_OVERALL_DATA_TRENDS_STAT")
public class OverallDataTrends {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 展示时间 单位/天
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "OVERALL_DATA_TRENDS_STAT_TIME")
	private Date time;

	/**
	 * 新增用户 通过与前一天的差值
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_NEWPEOPLE")
	private Long newPeople;

	/**
	 * 活跃用户
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_ACTPEOPLE")
	private Long activePeople;

	/**
	 * 总点播次数
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_TOTALPLAY")
	private Long totalPlay;

	/**
	 * 总付费用户数
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_TOTALPAID")
	private Long totalPaid;
	/**
	 * 平均观看时长
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_PERWATCHDURTIME")
	private Long perWatchDuringTime;

	/**
	 * 累计用户数
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_TOTALPEOPLE")
	private Long totalPeople;

	/**
	 * 平均点播次数
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_PERPLAY")
	private Long perPlay;

	/**
	 * 当时时时UV
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_NOWUV")
	private Long nowUV;

	/**
	 * 当时时时vv
	 */
	@Column(name = "OVERALL_DATA_TRENDS_STAT_NOWVV")
	private Long nowVV;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getNewPeople() {
		return newPeople;
	}

	public void setNewPeople(Long newPeople) {
		this.newPeople = newPeople;
	}

	public Long getActivePeople() {
		return activePeople;
	}

	public void setActivePeople(Long activePeople) {
		this.activePeople = activePeople;
	}

	public Long getTotalPlay() {
		return totalPlay;
	}

	public void setTotalPlay(Long totalPlay) {
		this.totalPlay = totalPlay;
	}

	public Long getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(Long totalPaid) {
		this.totalPaid = totalPaid;
	}

	public Long getPerWatchDuringTime() {
		return perWatchDuringTime;
	}

	public void setPerWatchDuringTime(Long perWatchDuringTime) {
		this.perWatchDuringTime = perWatchDuringTime;
	}

	public Long getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(Long totalPeople) {
		this.totalPeople = totalPeople;
	}

	public Long getPerPlay() {
		return perPlay;
	}

	public void setPerPlay(Long perPlay) {
		this.perPlay = perPlay;
	}

	public Long getNowUV() {
		return nowUV;
	}

	public void setNowUV(Long nowUV) {
		this.nowUV = nowUV;
	}

	public Long getNowVV() {
		return nowVV;
	}

	public void setNowVV(Long nowVV) {
		this.nowVV = nowVV;
	}

}
