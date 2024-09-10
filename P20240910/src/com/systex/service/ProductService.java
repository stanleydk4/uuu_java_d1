package com.systex.service;

import com.systex.model.Pruduct;

public class ProductService {
	public double caculateProductInventory(Pruduct pruduct) {
		return pruduct.getUnitPrice()*pruduct.getStock();
	}
}
