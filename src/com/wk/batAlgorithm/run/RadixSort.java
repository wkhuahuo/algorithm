package com.wk.batAlgorithm.run;

/**
 * Created by wkhuahuo on 16/10/6.
 */
public class RadixSort {


    public int[] radixSort(int[] A, int n) {
        // write code here
        int basicArr[] = new int[10];
        int extroSpace[] = new int[n];
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        for(int i =0;i<getLength(max);i++){

            for(int j = 0;j<A.length;j++){//遍历A所有元素，把分到相应的桶中
                basicArr[getNum(A[j], i)]++;
            }
            for(int j = 1; j<basicArr.length; j++){//得到每个桶的最右位置
                basicArr[j]+= basicArr[j-1];
            }

            for(int j=n-1; j>0;j--){
                extroSpace[basicArr[getNum(A[j],i)]--] = A[j];
            }

        }

        return A;
    }

    private int  getNum(int a, int posi){
        int num=a;
        int tmp[] ={10, 100, 1000, 10000};
        for(int i=0;i<posi-1;i++){

            num = num/tmp[i];
        }
        num = num%tmp[i];

        return num;
    }
    private int getLength(int a){
        int num =a;
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
