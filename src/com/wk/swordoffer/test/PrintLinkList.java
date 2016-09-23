package com.wk.swordoffer.test;

import com.wk.swordoffer.run.ListNode;

public class PrintLinkList {
	public static  void println(ListNode node){
		if(node != null ){
			while(node != null){
				System.out.print(node.val+",");
				node = node.next;
			}
			System.out.print("\n");
		}else{
			System.out.println("Is null");
		}
	}
}
