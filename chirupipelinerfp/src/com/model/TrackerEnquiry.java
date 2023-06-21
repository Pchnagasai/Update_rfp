
package com.model;

import org.springframework.stereotype.Component;

@Component
public class TrackerEnquiry {

	private int enqrid;

	public int getEnqrid() {
		return enqrid;
	}

	public void setEnqrid(int enqrid) {
		this.enqrid = enqrid;
	}

	@Override
	public String toString() {
		return "TrackerEnquiry [enqrid=" + enqrid + "]";
	}

}
