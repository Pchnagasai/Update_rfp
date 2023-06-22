package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RejectRfpRowMapper implements RowMapper<RejectRfp> {

	@Override
	public RejectRfp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RejectRfp rejectrfp = new RejectRfp();

		rejectrfp.setRfprenqrid(rs.getInt("rfpr_enqr_id"));
		rejectrfp.setRfpr_created_ausr_id(rs.getString("rfpr_created_ausr_id"));
		rejectrfp.setRfpr_status(rs.getString("rfpr_status"));
		rejectrfp.setRfpr_assignedto(rs.getString("rfpr_assignedto"));
		rejectrfp.setRfpr_subject(rs.getString("rfpr_subject"));
		rejectrfp.setRfpr_intro_note(rs.getString("rfpr_intro_note"));

		return rejectrfp;
	}

}
