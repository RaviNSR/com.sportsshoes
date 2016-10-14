package com.sportsshoes.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	@Autowired
	
	public void insert(User U);
	public void update(User U);
	public void delete(int uID);
	public User getuser(int uID);
	public List <User> getAlluser();

}
