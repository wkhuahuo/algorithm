package com.wk.batAlgorithm.sort.practice;

/**
 * Created by wkhuahuo on 10/11/16.
 */
public class SmallScaleSort {
    public int[] sortElement(int[] A, int n, int k) {

        for(int i=0;i<n;i++){



        }


        return A;

    }
    private int[] getFirstMin(int A[], int left,int right){
        int length=right;
        int tmp = 0;

        while(length>left){//当前未排序的长度
            if((length%2)==1){
                if(A[length]>A[(length-1)/2]){
                    tmp = A[length];
                    A[length] = A[(length-1)/2];
                    A[(length-1)/2] = tmp;
                }

            }else{
                if(A[length]>A[(length-2)/2]){
                    tmp = A[length];
                    A[length] = A[(length-2)/2];
                    A[(length-2)/2] = tmp;
                }
            }
            length--;
        }

        return A;

    }

    private int[] headSort(int A[], int left,int right){

        if(A==null ||A.length==1){
            return A;
        }
        int end = right;//带排序的最后一个数
        int length = right-left+1;
        int tmp=0;
        while(end>left){//记录最后一个未排好序的位置
            length = end;
            while(length>0){//当前未排序的长度
                if((length%2)==1){
                    if(A[length]>A[(length-1)/2]){
                        tmp = A[length];
                        A[length] = A[(length-1)/2];
                        A[(length-1)/2] = tmp;
                    }

                }else{
                    if(A[length]>A[(length-2)/2]){
                        tmp = A[length];
                        A[length] = A[(length-2)/2];
                        A[(length-2)/2] = tmp;
                    }
                }
                length--;
            }
            tmp = A[0];
            A[0] = A[end];
            A[end] = tmp;
            end--;
        }
        return A;
    }



}
