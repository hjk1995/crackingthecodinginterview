package com.crackingthecoding;

public class Java3_URLify {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String result = sol.replaceSpace("Mr John Smith");
        System.out.println(result);

    }
}

class Solution3 {
    String replaceSpace(String str){
        char[] charArray = str.toCharArray();
        String s="";
        for(char ch: charArray){
            if (ch == ' '){
                s=s+"%20";
            }
            else{
                s=s+ch;
            }
        }
        return s;
    }

}
