package com.sportsshoes.Product;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
public class ProductDAOimpl implements ProductDAO {
    
	@Autowired
	SessionFactory sess;
	@Transactional
	public void insert(Product P) {
		// TODO Auto-generated method stub
		sess.getCurrentSession().save(P);
	}
@Transactional
	public void update(Product P) {
		// TODO Auto-generated method stub
		sess.getCurrentSession().update(P);
	}
@Transactional
	public void delete(int ProductId) {
		// TODO Auto-generated method stub
		sess.getCurrentSession().createQuery("delete from Product P where ProductId = :id").setInteger("id",ProductId).executeUpdate();
	}
@Transactional
	public Product getProduct(int ProductId) {
		// TODO Auto-generated method stub
	List<Product> list = sess.getCurrentSession().createQuery("from Product P where ProductId=:id").setInteger("id",ProductId).list();
	if(!list.isEmpty())
	{
	return list.get(0);	
	}
	else
	return null;
	
	}
@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
	List<Product> list = sess.getCurrentSession().createQuery("from Product P").list();
		return list;
	}
@Transactional
	public Product getProductWithMaxId() {
		// TODO Auto-generated method stub
List<Product> list = sess.getCurrentSession().createQuery("from Product P where ProductId = (select max(p1.id) from Product p1)").list();
	
	if(!list.isEmpty())
	{
		return list.get(0);
	}
	else
		return null;
}
	}

