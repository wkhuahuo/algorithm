package com.wk.baseAlgorithm.run;

/**
 * 归并排序
 * @author wkhuahuo
 *实现归并排序
 */
public class MergeSort {
	
	public static void sort(int[] array){
		int begin = 0;
		int end = array.length-1;
		
		sort(array,begin,end);
	}
	public static int[] sort(int[] array,int begin, int end){
		int mid = (begin+end)/2;
		if(begin< end){
		//归并左半部分
			sort(array,begin,mid);
		//归并右半部分
			sort(array,mid+1,end);
		//排序
			merge(array,begin,mid,end);
		}
		return array;
	}
	private static void merge(int[] array, int begin, int mid, int end){
		int[] tmparr = new int[end-begin+1];
		int ibegin =begin;
		int jmid = mid+1;
		int ktmparr = 0;
		
		while(ibegin<=mid&&jmid<=end){
			if(array[ibegin]<=array[jmid]){
				tmparr[ktmparr++] = array[ibegin++];
			}else{
				tmparr[ktmparr++] = array[jmid++];
			}
		}
		while(ibegin<=mid){
			tmparr[ktmparr++] = array[ibegin++];
		}
		while(jmid<=end){
			tmparr[ktmparr++] = array[jmid++];
		}
		for(int i = 0;i<tmparr.length;i++){
			array[begin+i] = tmparr[i];
		}
	}
	
}
