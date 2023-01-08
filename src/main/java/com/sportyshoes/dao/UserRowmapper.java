package com.sportyshoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sportyshoes.dto.UserRegistration;

public class UserRowmapper implements RowMapper<UserRegistration> {

	@Override
	public UserRegistration mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserRegistration user=new UserRegistration();
		user.setFirstname(rs.getString(1));
		user.setLastname(rs.getString(2));
		user.setEmail(rs.getString(3));
		user.setPassword(rs.getString(4));
		return user;
	}
	

}
