package com.my.wkts.util;

import java.util.Random;

public class CodeManager {
	
	public String randomNum(){
		Random r = new Random();
		System.out.println("randomNum IN Test");
		String randomNum = "" + r.nextInt(10000);
		if(randomNum.length() != 5){
			int addNum = 5 - randomNum.length();
			if(addNum > 0){
				for(int i=0; i<addNum; i++){
					randomNum = "0" + randomNum;
				}
			}
		}
		System.out.println("randomNum Test : " + randomNum);
		return randomNum;
	}

}
