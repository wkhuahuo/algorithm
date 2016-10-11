package com.wk.batAlgorithm.test.base;

import com.wk.batAlgorithm.sort.base.InsertionSort;

import junit.framework.TestCase;

public class InsertionSortTest extends TestCase{
	public void test(){
		int A[] = {4,5,3,1,2,8,7};
		InsertionSort insertSort = new InsertionSort();
		A = insertSort.insertionSort(A, A.length);
		for(int i:A){
			System.out.print(i+" ");
		}
	}
}
