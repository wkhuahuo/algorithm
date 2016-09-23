package com.wk.swordoffer.test;

import java.util.Random;

import com.wk.swordoffer.run.ListNode;

public class LinkList {
	
    private ListNode head =new ListNode(0);
    private ListNode tail= head;
    
    public ListNode getFirst(){
    	if(head.next==null) return null;
    	
    	return head.next;
    }
	public void  addNode(int val){
    	
    	tail.next=new ListNode(val);
    	tail= tail.next;
    }
}
