package com.sportyshoes.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.sportyshoes.dto.products;

public class ManageProductsRowMapper implements RowMapper {

	@Override
	public products mapRow(ResultSet rs, int rowNum) throws SQLException {
		products p=new products();
		p.setSno(rs.getInt(1));
		p.setBrand(rs.getString(2));
		p.setType(rs.getString(3));
		p.setColor(rs.getString(4));
		p.setSize(rs.getInt(5));
		return p;
	}

}
