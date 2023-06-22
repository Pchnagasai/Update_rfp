package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RejectRfpRowMapper implements RowMapper<RejectRfp> {

	@Override
	public RejectRfp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		RejectRfp rejectrfp = new RejectRfp();
		System.out.println(rejectrfp);
		rejectrfp.setRfpr_enqr_id(rs.getInt("rfpr_enqr_id"));

		return rejectrfp;
	}

}
