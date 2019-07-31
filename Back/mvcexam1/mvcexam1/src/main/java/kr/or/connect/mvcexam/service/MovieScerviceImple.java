package kr.or.connect.mvcexam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.mvcexam.dao.MovieDao;
import kr.or.connect.mvcexam.dto.Movie;

@Service
public class MovieScerviceImple implements MovieService {

	@Autowired
	MovieDao moviedao;
	
	@Override
	public List<Movie> getBookMovie() {
		return moviedao.selectAll();
	}

	@Override
	public int getRemainSet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScheeduleTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}
