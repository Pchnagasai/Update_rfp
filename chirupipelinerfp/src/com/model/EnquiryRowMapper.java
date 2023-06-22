
package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EnquiryRowMapper implements RowMapper<TrackerEnquiry> {

	@Override
	public TrackerEnquiry mapRow(ResultSet rs, int rowNum) throws SQLException {

		TrackerEnquiry enquiry = new TrackerEnquiry();

		enquiry.setEnqrid(rs.getInt("enqr_id"));
		enquiry.setEnqcustid(rs.getInt("enqr_cust_id"));
		enquiry.setEnqrcreatedby(rs.getString("enqr_createdby"));
		enquiry.setEnqrsubject(rs.getString("enqr_subject"));
		enquiry.setEnqrdesc(rs.getString("enqr_desc"));
		enquiry.setEnqrassignto(rs.getString("enqr_assigned_to"));
		enquiry.setEnqrluser(rs.getString("enqr_luser"));

		return enquiry;
	}
}
