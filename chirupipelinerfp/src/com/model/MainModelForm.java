package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MainModelForm {
	private List<TrackerEnquiry> trackerenquiry;
	private List<RejectEnquiry> rejectenjuiry;
	private List<RejectRfp> rejectrfp;

	public List<TrackerEnquiry> getTrackerenquiry() {
		return trackerenquiry;
	}

	public void setTrackerenquiry(List<TrackerEnquiry> trackerenquiry) {
		this.trackerenquiry = trackerenquiry;
	}

	public List<RejectEnquiry> getRejectenjuiry() {
		return rejectenjuiry;
	}

	public void setRejectenjuiry(List<RejectEnquiry> rejectenjuiry) {
		this.rejectenjuiry = rejectenjuiry;
	}

	public List<RejectRfp> getRejectrfp() {
		return rejectrfp;
	}

	public void setRejectrfp(List<RejectRfp> rejectrfp) {
		this.rejectrfp = rejectrfp;
	}

}
