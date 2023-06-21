
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

		return reject;
	}

}