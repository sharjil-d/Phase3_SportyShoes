package com.sportyshoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sportyshoes.dto.Adminlogin;

public class AdminRowmapper implements RowMapper<Adminlogin> {

	@Override
	public Adminlogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Adminlogin admin =new Adminlogin();
		admin.setUsername(rs.getString(1));
		admin.setPassword(rs.getString(2));
		return admin;
	}

}
