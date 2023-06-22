
package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RejectRowMapper implements RowMapper<RejectEnquiry> {

	@Override
	public RejectEnquiry mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		RejectEnquiry reject = new RejectEnquiry();
		reject.setEnqr_id(rs.getInt("e_id"));
		reject.setEnqid(rs.getInt("enqr_id"));
		reject.setEnqcustid(rs.getInt("enqr_cust_id"));
		reject.setEnqrcreatedby(rs.getString("enqr_createdby"));
		reject.setEnqrsubject(rs.getString("enqr_subject"));
		reject.setEnqrdesc(rs.getString("enqr_desc"));
		reject.setEnqrassignto(rs.getString("enqr_assigned_to"));
		reject.setEnqrluser(rs.getString("enqr_luser"));

		return reject;
	}

}