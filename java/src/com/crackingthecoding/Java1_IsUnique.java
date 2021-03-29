package com.crackingthecoding;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */

import java.util.*;

public class Java1_IsUnique {

    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean bool =sol.isUnique("harshil");
        System.out.println(bool);
    }
}

class Solution {
    boolean isUnique(String abc){
        Set<Character> charSet = new HashSet<Character>();
        for (char c : abc.toCharArray()) {
            charSet.add(c);
        }
        if(abc.length()!=charSet.size()){
            return false;
        }
        return true;
    }
}