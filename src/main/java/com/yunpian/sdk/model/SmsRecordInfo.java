package com.yunpian.sdk.model;

import com.yunpian.sdk.util.JsonUtil;

/**
 * Created by bingone on 16/1/18.
 */
public class SmsRecordInfo {
	private String sid;
	private String mobile;
	private String sendTime;
	private String text;
	private String reportStatus;
	private Double fee;
	private String userReceiveTime;
	private String errorMsg;
	private String uid;

	@Override
	public String toString() {
		return JsonUtil.toJson(this);
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserReceiveTime() {
		return userReceiveTime;
	}

	public void setUserReceiveTime(String userReceiveTime) {
		this.userReceiveTime = userReceiveTime;
	}
}
