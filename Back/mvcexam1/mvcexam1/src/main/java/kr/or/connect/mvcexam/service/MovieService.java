package kr.or.connect.mvcexam.service;

import java.util.List;

import kr.or.connect.mvcexam.dto.Movie;

public interface MovieService {
	public List<Movie> getBookMovie();
	public int getRemainSet();
	public int getScheeduleTime();
}
