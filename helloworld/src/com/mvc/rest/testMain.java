package com.mvc.rest;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String maxID = "TLS0000321";
			String lastStr = maxID.substring(3,maxID.length());
			int id =  Integer.valueOf(lastStr) + 1;
			String newMaxID = maxID.substring(0,3);
			for(int i=0;i<7-String.valueOf(id).length();i++){
				newMaxID +="0";
			}
			newMaxID +=String.valueOf(id);
			System.out.print("newMaxID "+newMaxID);
		}

}
