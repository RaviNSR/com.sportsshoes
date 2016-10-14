package com.sportsshoes.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserDAO udao;
	public void insert(User U) {
		// TODO Auto-generated method stub
		udao.insert(U);
	}

	public void update(User U) {
		// TODO Auto-generated method stub
	udao.update(U);	
	}

	public void delete(int uID) {
		// TODO Auto-generated method stub
	udao.delete(uID);	
	}

	public User getuser(int uID) {
		// TODO Auto-generated method stub
		return udao.getuser(uID);
	}

	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return udao.getAlluser();
	}

}
