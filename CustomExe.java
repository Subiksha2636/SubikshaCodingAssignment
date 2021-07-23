package com.subis.day7;
import java.util.*;

class Repository extends Exception {
	Repository(String msg){
		super(msg);
	}
	
	
}

public  class CustomExe {
	
	public static void main(String[] args)throws Exception {
		///Repository r=new Repository();
		//System.out.println(r.getCountryName("80"));*/
		Scanner s = new Scanner(System.in);
		String  n1 = s.next();
		int n = Integer.parseInt(n1);
		if((n>=70) && (n<=99) ){
			System.out.println("India");
		}
		else if(n==908){
			System.out.println("US");
		}
		else if(n==011){
			System.out.println("USA");
		}
		else {
			throw new Repository("Invalid code");
		}
	}

	
}


