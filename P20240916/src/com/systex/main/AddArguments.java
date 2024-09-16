package com.systex.main;

public class AddArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
			int sum = 0;
			for(String number:args) {
				try {
					sum += Integer.parseInt(number);
				}catch(NumberFormatException e){
					System.out.println("參數['"+number+"']不正確，故未加總");
				}
			}
			System.out.println("總和="+sum);
//		}catch (NumberFormatException e) {
//			System.out.println("您輸入的部分資料可能不正確，請您再檢查一下0.<");
//		}
		System.out.println("感謝您使用本程式!");
	}

}
