package com.systex.main;

import com.systex.model.*;
import com.systex.service.ProductService;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("可口可樂");
		p1.setUnitPrice(12.0);
		p1.setFree(false);
		p1.incStock(10000);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("百事可樂");
		p2.setUnitPrice(11.5);
		p2.setFree(false);
		p2.incStock(5000);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("鱈魚香絲");
		p3.setUnitPrice(60.0);
		p3.setFree(false);
		p3.incStock(2000);
		
		Product p4 = new Product();
		p4.setId(4);
		p4.setName("多力多滋");
		p4.setUnitPrice(65.0);
		p4.setFree(false);
		p4.incStock(500);
		
		Product p5 = new Product();
		p5.setId(5);
		p5.setName("可口奶滋");
		p5.setUnitPrice(50.0);
		p5.setFree(false);
		p5.incStock(1000);
		
		Product p6 = new Product(6,"咖啡蛋捲",500,false,0);
		Product p7 = new Product(7,"iphone6");
		ProductService ps = new ProductService();
		
		System.out.println("產品庫存報表");
		System.out.println("=================================================");
		System.out.println("序號\t品名\t單價\t免費(?)\t庫存量\t庫存價值");
		System.out.println("=================================================");
		System.out.println(p1+"\t"+ps.caculateProductInventory(p1));
		System.out.println(p2+"\t"+ps.caculateProductInventory(p2));
		System.out.println(p3+"\t"+ps.caculateProductInventory(p3));
		System.out.println(p4+"\t"+ps.caculateProductInventory(p4));
		System.out.println(p5+"\t"+ps.caculateProductInventory(p5));
		System.out.println(p6+"\t"+ps.caculateProductInventory(p6));
		System.out.println(p7+"\t"+ps.caculateProductInventory(p7));
		System.out.println("=================================================");
		
			
		}
}


