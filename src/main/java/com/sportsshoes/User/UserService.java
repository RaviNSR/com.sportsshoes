package com.sportsshoes.User;

import java.util.List;

public interface UserService {

	public void insert(User U);
	public void update(User U);
	public void delete(int uID);
	public User getuser(int uID);
	public List <User> getAlluser();
}
