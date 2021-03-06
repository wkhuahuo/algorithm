package com.wk.batAlgorithm.dynamicprogramming;

/**
 * 一个背包有一定的承重cap，有N件物品，每件都有自己的价值，记录在数组v中，也都有自己的重量，
 * 记录在数组w中，每件物品只能选择要装入背包还是不装入背包，要求在不超过背包承重的前提下，
 * 选出物品的总价值最大。
 * 给定物品的重量w价值v及物品数n和承重cap。请返回最大总价值。
 * 测试样例：
 * [1,2,3],[1,2,3],3,6
 * 返回：6
 * Created by wkhuahuo on 2017/3/1.
 */
public class Backpack {
    public int maxValue(int[] w, int[] v, int n, int cap) {
        int[][] map = new int[n][cap+1];
        for(int i=0;i<cap+1;i++){
            if(i>=w[0]) {
                map[0][i] = v[0];
            }else{
                map[0][i] = 0;
            }
        }
        for(int i=0;i< n;i++){
            map[i][0] = 0;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<cap+1;j++){
                if(j>= w[i]) {
                    map[i][j] = Math.max(map[i - 1][j],map[i-1][j-w[i]]+v[i]);
                }else {
                    map[i][j] = map[i-1][j];
                }
            }
        }

        return map[n-1][cap];
    }


}
