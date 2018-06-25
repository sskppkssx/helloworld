package com.mvc.rest;

public class Main {
	
	public static void main(String[] args){
		Integer i1 =100;
		Integer i2 =100;
		if(i1 == i2){
			System.out.println("1");
		}else{
			System.out.println("2");
		}
		Integer i3 =null;
		//int j = i3;
		try {

			//int j = i3;
			throw new NullPointerException("参数不能为空");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			return;
		}
		
	}
	

}
