package work.wk.mianshi.mianshi360;

import java.util.Scanner;



/**
 * Created by wkhuahuo on 2017/3/18.
 */
public class Main2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
            num--;
            printresult();
        }
    }
    private static void printresult(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] golds = new int[num];
        for(int i=0;i<num;i++){
            golds[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){

        }
    }
}
