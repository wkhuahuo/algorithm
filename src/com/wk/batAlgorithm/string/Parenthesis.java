package com.wk.batAlgorithm.string;

/**
 * Created by wkhua on 16/12/13.
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {

        int back =0;
        boolean previous = true;
        for(int i=0;i<n;i++){
            if(A.charAt(i) == '('){
                if(previous) {
                    back++;
                }else{
                    if(back>0){
                        return false;
                    }
                }
            }else if(A.charAt(i) == ')'){
                if(back<0) {
                    return false;
                }else{
                    back--;

                    previous = false;

                }
            }else{
                return false;
            }
        }
        return true;
    }
}
