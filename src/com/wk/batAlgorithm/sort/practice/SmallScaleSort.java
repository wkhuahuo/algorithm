package com.wk.batAlgorithm.sort.practice;

/**
 * Created by wkhuahuo on 10/11/16.
 */
public class SmallScaleSort {
    public void smallScaleSort(int A[], int n){



    }

    private int[] headSort(int A[], int n){

        if(A==null ||A.length==1){
            return A;
        }
        int end = n-1;
        int length = n-1;
        int tmp=0;
        while(end>0){
            length = end;

            while(length>0){
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
