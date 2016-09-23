package com.wk.baseAlgorithm.test;

import java.util.Arrays;

import com.wk.baseAlgorithm.run.MergeSort;

public class MergeSortTest {
	public static void main(String[] args){
		int[] array = {8,2,7,3,1,6,9,0,5,4};
		MergeSort.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
