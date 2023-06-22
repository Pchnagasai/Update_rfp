
package com.model;

import org.springframework.stereotype.Component;

@Component
public class TrackerEnquiry {

	private int enqrid;
	private int enqcustid;
	private String enqrcreatedby;
	private String enqrsubject;
	private String enqrdesc;
	private String enqrassignto;
	private String enqrluser;

	public int getEnqrid() {
		return enqrid;
	}

	public void setEnqrid(int enqrid) {
		this.enqrid = enqrid;
	}

	public int getEnqcustid() {
		return enqcustid;
	}

	public void setEnqcustid(int enqcustid) {
		this.enqcustid = enqcustid;
	}

	public String getEnqrcreatedby() {
		return enqrcreatedby;
	}

	public void setEnqrcreatedby(String enqrcreatedby) {
		this.enqrcreatedby = enqrcreatedby;
	}

	public String getEnqrsubject() {
		return enqrsubject;
	}

	public void setEnqrsubject(String enqrsubject) {
		this.enqrsubject = enqrsubject;
	}

	public String getEnqrdesc() {
		return enqrdesc;
	}

	public void setEnqrdesc(String enqrdesc) {
		this.enqrdesc = enqrdesc;
	}

	public String getEnqrassignto() {
		return enqrassignto;
	}

	public void setEnqrassignto(String enqrassignto) {
		this.enqrassignto = enqrassignto;
	}

	public String getEnqrluser() {
		return enqrluser;
	}

	public void setEnqrluser(String enqrluser) {
		this.enqrluser = enqrluser;
	}

	@Override
	public String toString() {
		return "TrackerEnquiry [enqrid=" + enqrid + ", enqcustid=" + enqcustid + ", enqrcreatedby=" + enqrcreatedby
				+ ", enqrsubject=" + enqrsubject + ", enqrdesc=" + enqrdesc + ", enqrassignto=" + enqrassignto
				+ ", enqrluser=" + enqrluser + "]";
	}

}
