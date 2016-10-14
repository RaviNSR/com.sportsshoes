package com.sportsshoes.User;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
@Repository
@EnableTransactionManagement
public class UserDAOimpl implements UserDAO {
	@Autowired
	SessionFactory sess;
@Transactional
	public void insert(User U) {
		// TODO Auto-generated method stub
	
	System.out.println(U);
	sess.getCurrentSession().save(U);	
	}
@Transactional
	public void update(User U) {
		// TODO Auto-generated method stub
	sess.getCurrentSession().update(U);	
	}
@Transactional
	public void delete(int uID) {
		// TODO Auto-generated method stub
	sess.getCurrentSession().createQuery("delete from user U where UID").setInteger("UID",uID).executeUpdate();
	}
@Transactional
	public User getuser(int uID) {
		// TODO Auto-generated method stub
		List<User> list = sess.getCurrentSession().createQuery("from user U where UID").setInteger("UID",uID).list();
		if(!list.isEmpty())
		{
			return list.get(0);
		}else
		return null;
	}

	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		List<User> list = sess.getCurrentSession().createQuery("from user U").list();
		return list;
	}


}
