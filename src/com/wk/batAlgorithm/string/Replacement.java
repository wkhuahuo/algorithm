package com.wk.batAlgorithm.string;

/**
 * Created by wkhua on 16/12/13.
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {

        char[] str = new char[1000];
        int j=0;
        for(int i=0;i<length;i++){

            if(iniString.charAt(i) ==' '){
                str[j++] = '%';
                str[j++] = '2';
                str[j++] = '0';
            }else{
                str[j++] = iniString.charAt(i);
            }
        }
        return String.valueOf(str);
    }
/*
    int count=0;
        for(int i=0;i<length;i++){
        if(iniString.charAt(i) == ' '){
            count++;
        }
    }
        if(count==0){
        return iniString;
    }*/
}
