package com.model;

public class RejectRfp {

	private int rfprenqrid;
	private String rfpr_created_ausr_id;
	private String rfpr_status;
	private String rfpr_assignedto;
	private String rfpr_subject;
	private String rfpr_intro_note;

	public int getRfprenqrid() {
		return rfprenqrid;
	}

	public void setRfprenqrid(int rfprenqrid) {
		this.rfprenqrid = rfprenqrid;
	}

	public String getRfpr_created_ausr_id() {
		return rfpr_created_ausr_id;
	}

	public void setRfpr_created_ausr_id(String rfpr_created_ausr_id) {
		this.rfpr_created_ausr_id = rfpr_created_ausr_id;
	}

	public String getRfpr_status() {
		return rfpr_status;
	}

	public void setRfpr_status(String rfpr_status) {
		this.rfpr_status = rfpr_status;
	}

	public String getRfpr_assignedto() {
		return rfpr_assignedto;
	}

	public void setRfpr_assignedto(String rfpr_assignedto) {
		this.rfpr_assignedto = rfpr_assignedto;
	}

	public String getRfpr_subject() {
		return rfpr_subject;
	}

	public void setRfpr_subject(String rfpr_subject) {
		this.rfpr_subject = rfpr_subject;
	}

	public String getRfpr_intro_note() {
		return rfpr_intro_note;
	}

	public void setRfpr_intro_note(String rfpr_intro_note) {
		this.rfpr_intro_note = rfpr_intro_note;
	}

	@Override
	public String toString() {
		return "RejectRfp [rfprenqrid=" + rfprenqrid + ", rfpr_created_ausr_id=" + rfpr_created_ausr_id
				+ ", rfpr_status=" + rfpr_status + ", rfpr_assignedto=" + rfpr_assignedto + ", rfpr_subject="
				+ rfpr_subject + ", rfpr_intro_note=" + rfpr_intro_note + "]";
	}

}
