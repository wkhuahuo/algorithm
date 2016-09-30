package com.wk.swordoffer.run;


public class CopyComplixList {
	
	public RandomListNode Clone(RandomListNode pHead)
    {	
		if(pHead==null) return null;
		
		RandomListNode root = new RandomListNode(pHead.label);
		if(pHead.next!=null){
			root.next = Clone(pHead.next);
		}
		if(pHead.random!= null){
			root.random = Clone(pHead.random);
		}
		
		return root;
        
    }
}
