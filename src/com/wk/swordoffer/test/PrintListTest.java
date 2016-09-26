package com.wk.swordoffer.test;

import com.wk.swordoffer.run.ListNode;
import com.wk.swordoffer.run.PrintList;

import junit.framework.TestCase;

public class PrintListTest extends TestCase{
	public void test(){
		ListNode ln = new ListNode(0);
		ListNode head = ln;
		for(int i=1;i<10;i++){
			ln.next = new ListNode(i);
			ln = ln.next;
		}
			
		PrintList pl = new PrintList();
		System.out.println(pl.printListFromTailToHead(head).toString());
		
	}

}
