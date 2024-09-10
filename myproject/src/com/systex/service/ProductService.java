package com.systex.service;

import com.systex.model.Product;

public class ProductService {
	public double caculateProductInventory(Product pruduct) {
		return pruduct.getUnitPrice()*pruduct.getStock();
	}
}
