package kr.or.connect.mvcexam.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.mvcexam.dto.User;

@Repository
public class UserDao {

	private NamedParameterJdbcTemplate jdbc;
	 private SimpleJdbcInsert insertAction;
	 private RowMapper<User> rowMapper = BeanPropertyRowMapper.newInstance(User.class);
	 
	  public UserDao(DataSource dataSource) {
	        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	        this.insertAction = new SimpleJdbcInsert(dataSource)
	                .withTableName("user");
	                
	    }
	    
	 
	 public void insert(User user) {
			Map<String,Object> param = new HashMap<>();
			param.put("id",user.getId());
			param.put("pwd",user.getPwd());
			int a = insertAction.execute(param);
			System.out.println(a);
			
		}
	 

}
