package com.sportyshoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;

public class SearchUserRowMapper implements RowMapper {

	@Override
	public UserRegistration mapRow(ResultSet rs,int rowNum) throws SQLException {
		
			UserRegistration users=new UserRegistration();
			users.setFirstname(rs.getString(1));
			users.setLastname(rs.getString(2));
			users.setEmail(rs.getString(3));
			users.setPassword(rs.getString(4));
			return users;
		}

}

