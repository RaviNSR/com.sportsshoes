package com.sportsshoes.Product;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5173150630220598114L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ProductId;
	private String ProductName;
	private String ProductCateogry;
	private String ProductDescription;
	private String ProductPrice;
	private String ProductImage;

	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCateogry() {
		return ProductCateogry;
	}
	public void setProductCateogry(String productCateogry) {
		ProductCateogry = productCateogry;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductImage() {
		return ProductImage;
	}
	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}

}
