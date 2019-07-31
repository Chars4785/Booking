package kr.or.connect.mvcexam.dao;

import static kr.or.connect.mvcexam.dao.MovieDaoSqls.SELECT_MOVIE;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.mvcexam.dto.Movie;

@Repository
public class MovieDao {
	private NamedParameterJdbcTemplate jdbc;
	 private SimpleJdbcInsert insertAction;
	 private RowMapper<Movie> rowMapper = BeanPropertyRowMapper.newInstance(Movie.class);

	 public MovieDao(DataSource dataSource) {
	     this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	 }
	 
	  public List<Movie> selectAll() {
		  return jdbc.query(SELECT_MOVIE, Collections.emptyMap(), rowMapper);
	  }
	 
}
