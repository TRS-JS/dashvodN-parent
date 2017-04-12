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
 * UV,VV涨幅：
 *   前一日用户数UV与播放次数VV和上一日同数据的增长幅度
 * @author Administrator
 *
 */

@Entity
@Table(name="DASHVOD_UVVV_STAT")
public class UVVVSTAT {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * 时间    单位/天
	 */
	@Column(name="UVVV_STAT_TIME")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8" )
	private Date time;
	
	/**
	 * 当天UV总数
	 */
	@Column(name="UVVV_STAT_UVSTAT")
	private Long UVStat;
	
	/**
	 * 当天UV总数相比前一天的涨幅
	 */
	@Column(name="UVVV_STAT_UVROSE")
	private Double UVStatRose;
	
	/**
	 * 当天VV总数
	 */
	@Column(name="UVVV_STAT_VVSTAT")
	private Long VVStat;
	
	/**
	 * 当天VV总数相比前一天涨幅
	 */
	@Column(name="UVVV_STAT_VVROSE")
	private Double VVStatRose;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Long getUVStat() {
		return UVStat;
	}

	public void setUVStat(Long uVStat) {
		UVStat = uVStat;
	}

	public Double getUVStatRose() {
		return UVStatRose;
	}

	public void setUVStatRose(Double uVStatRose) {
		UVStatRose = uVStatRose;
	}

	public Long getVVStat() {
		return VVStat;
	}

	public void setVVStat(Long vVStat) {
		VVStat = vVStat;
	}

	public Double getVVStatRose() {
		return VVStatRose;
	}

	public void setVVStatRose(Double vVStatRose) {
		VVStatRose = vVStatRose;
	}
	
	
	
}
