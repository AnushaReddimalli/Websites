package com.att.product.dao;

public class Product {
	private String productId;
	private String productName;
	private String productDescription;
	private String relatedProducts;
	private String productImage;

	public Product()
	{

	}
	public Product(String productId, String productName, String productDescription, String relatedProducts, String productImage) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.relatedProducts = relatedProducts;
		this.productImage = productImage;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getRelatedProducts() {
		return relatedProducts;
	}
	public void setRelatedProducts(String relatedProducts) {
		this.relatedProducts = relatedProducts;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

}
