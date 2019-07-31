package kr.or.connect.mvcexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.mvcexam.dao.UserDao;
import kr.or.connect.mvcexam.dto.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	@Transactional
	public User addUser(User user) {
		userdao.insert(user);
		return user;
	}

}
