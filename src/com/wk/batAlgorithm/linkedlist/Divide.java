package com.wk.batAlgorithm.linkedlist;

/**
 * Created by wkhua on 16/12/21.
 */
public class Divide {
    public ListNode listDivide(ListNode head, int val) {
        ListNode tmpNode = head;
        ListNode smaller=null;
        ListNode smallerb=smaller;
        ListNode bigger=null;
        ListNode biggerb=bigger;
        ListNode equal=null;
        ListNode equalb=equal;
        while(tmpNode!=null){
            if(tmpNode.val<val){
                if(smallerb==null) {
                    smaller = tmpNode;
                    smallerb = smaller;
                }else {
                    smaller.next = tmpNode;
                    smaller = smaller.next;
                }
                tmpNode= tmpNode.next;
                smaller.next = null;

            }else if(tmpNode.val>val){
                if(biggerb==null) {
                    bigger = tmpNode;
                    biggerb = bigger;
                }else {
                    bigger.next=tmpNode;
                    bigger = bigger.next;
                }
                tmpNode= tmpNode.next;
                bigger.next = null;
            }else {
                if(equalb==null) {
                    equal = tmpNode;
                    equalb = equal;
                }else {
                    equal.next =tmpNode;
                    equal = equal.next;
                }
                tmpNode= tmpNode.next;
                equal.next = null;
            }
        }

        if(smallerb ==null){
            if(equalb ==null){
                head = biggerb;
            }else {
                head = equalb;
            }

        }else{
            head = smallerb;
        }



/*

        head = smallerb;
        ListNode tailNode = smaller;
        if(smallerb != null){
            smaller.next = equalb;
        }else {
            tailNode = equalb;
        }
        tailNode = equal;

        if(tailNode != null){
            equal.next = biggerb;
        }else {
            tailNode = biggerb;
        }
        tailNode = bigger;
*/



        return head;
    }

    public String myString(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode tmp = listNode;
        while(tmp!=null && tmp.next!=listNode){
            stringBuilder.append(tmp.val+",");
            tmp = tmp.next;
        }
        return stringBuilder.toString();
    }
}
