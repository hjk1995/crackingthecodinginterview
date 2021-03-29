package com.crackingthecoding;

import java.util.Arrays;
import java.util.Locale;

/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other.
 */

public class Java2_CheckPermutation {
    public static void main(String args[]){
        Solution2 sol = new Solution2();
        boolean res = sol.checkPermutation("god","doG");
        System.out.println(res);
    }
}

class Solution2 {
    String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    boolean checkPermutation(String str, String pString){
        if(sortString(pString.toLowerCase(Locale.ROOT)).equals(sortString(str.toLowerCase(Locale.ROOT)))){
            return true;
        }
        return false;
    }

}
