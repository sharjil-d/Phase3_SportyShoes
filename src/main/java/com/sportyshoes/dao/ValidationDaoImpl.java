package com.sportyshoes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sportyshoes.dto.Adminlogin;
import com.sportyshoes.dto.UserRegistration;
import com.sportyshoes.dto.products;


@Repository
@Transactional
public class ValidationDaoImpl implements ValidationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@Override
	public boolean registerUser(UserRegistration user) {
		boolean isUserRegistered=false;
		String sql="insert into userregistration values(?,?,?,?)";
		int val=jdbcTemplate.update(sql,user.getFirstname(),user.getLastname(),user.getEmail(),user.getPassword());
		if(val>0)
			return isUserRegistered=true;
		else
			return isUserRegistered;
	}

	@Override
	public boolean validateAdmin(Adminlogin admin) {
		boolean isAdminvalid=false;
		Adminlogin admin2=null;
		String sql="select * from admin where username=? and password=?";
		try {
			admin2=jdbcTemplate.queryForObject(sql, new AdminRowmapper(),new Object[] {admin.getUsername(),admin.getPassword()});
			
			}
			catch(EmptyResultDataAccessException e) {
				admin2=null;
			}
			if(admin2!=null)
			
				isAdminvalid=true;
			return isAdminvalid;
		}



	@Override
	public boolean validateUser(UserRegistration user) {
		boolean isUservalid=false;
		UserRegistration user2=null;
		String sql="select * from userregistration where firstname=? and password=?";
		try {
			 user2=jdbcTemplate.queryForObject(sql, new UserRowmapper(),new Object[] {user.getFirstname(),user.getPassword()});
			
			}
			catch(EmptyResultDataAccessException e) {
				user2=null;
			}
			if(user2!=null)
			
				isUservalid=true;
			return isUservalid;
		}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<products> manageproducts() {
		
		String sql="select * from products";
		
			 List<products> p=(List<products>) jdbcTemplate.query(sql,new ManageProductsRowMapper());
			return p;
			 
			
			
		}
	public boolean deleteproduct(int num) {
		String query="delete from products where sno =?";
		int a=jdbcTemplate.update(query,num);
		
		return true;
		
	}

	@Override
	public List<UserRegistration> searchusers() {
		
		String sql="select * from userregistration";
		
		 List<UserRegistration> userss=(List<UserRegistration>) jdbcTemplate.query(sql,new SearchUserRowMapper());
		return userss;
		 
	}
	
}
