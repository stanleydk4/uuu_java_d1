package com.systex.model;

public class Pruduct {
	private int id;
	private String name;
	private double unitPrice;
	private boolean free;
	private int stock;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		if(unitPrice>=10) {
			this.unitPrice = unitPrice;
		}else {
			//throw new RuntimeException("Oops...price not correct");
			this.unitPrice = 10.0;
		}
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getStock() {//查詢庫存
		return stock;
	}

	public void incStock(int amount) {//進貨
		this.stock += amount;
	}
	
	public void decStock(int amount) {//出貨
		this.stock -= amount;
	}

	public String toString() {
		return id+"\t"+name+"\t"+unitPrice+"\t"
				+free+"\t"+stock;
	}
}
