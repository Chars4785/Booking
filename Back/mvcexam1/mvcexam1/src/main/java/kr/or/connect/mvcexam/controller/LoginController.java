package kr.or.connect.mvcexam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.mvcexam.dto.Movie;
import kr.or.connect.mvcexam.dto.User;
import kr.or.connect.mvcexam.service.MovieService;
import kr.or.connect.mvcexam.service.UserService;

@RestController
@RequestMapping(path="/")
public class LoginController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/movie")
	public Map<String,Object> list(){
		List<Movie> movieList = movieService.getBookMovie();
		Map<String,Object> list = new HashMap<>();
		
		for(Movie m : movieList) {
			list.put("name",m);
		}
		
		return list;
	}
	
	@PostMapping("/login")
	public String addUser(@RequestParam(name="id")String id,
			@RequestParam(name="pwd")String pwd){
		User user = new User();
		System.out.println(id);
		user.setId(id);
		user.setPwd(pwd);
		
		try {
			userService.addUser(user);
		} catch (Exception e) {
			
		}
		
		return "regist";
	}

}
