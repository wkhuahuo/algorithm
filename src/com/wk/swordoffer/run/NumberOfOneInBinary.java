package com.wk.swordoffer.run;

public class NumberOfOneInBinary {
	public int _1_numberOf1(int n){
		int flag=1;
		int count =0;
		while(flag!=0){
			if((n&flag)!=0){
				count++;
				flag =flag << 1;
			}else{
				flag <<=1;
			}
		}
		return count;
	}
	public int numberOf1(int n){
		int count =0;
		while(n!=0){
			n=n&(n-1);
			count++;
		}
		return count;
	}
	
}
