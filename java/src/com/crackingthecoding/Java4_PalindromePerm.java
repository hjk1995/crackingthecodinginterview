package com.crackingthecoding;

public class Java4_PalindromePerm {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        String str="Tact Coa";
        System.out.println(sol.checkPalindromPermutation(str));
    }
}

class Solution4 {
    int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z =  Character.getNumericValue('z');
        int A = Character.getNumericValue('A');
        int Z =  Character.getNumericValue('Z');

        int val =  Character.getNumericValue(c);
        if(a<=val && val<=z){
            return val-a;
        }
        else if(A<=val && val<=Z){
            return val-A;
        }
        return -1;
    }

    boolean checkPalindromPermutation(String str){
        int countOdd=0;
        int[] tableofAlpha = new int[Character.getNumericValue('z')-Character.getNumericValue('a')];
        for(char c: str.toCharArray()){
            int x=getCharNumber(c);
            if(x!=-1){
                tableofAlpha[x]++;
                if((tableofAlpha[x]&2)==1){
                    countOdd++;
                }
                else{
                    countOdd--;
                }
            }
        }
        return (countOdd<=1);
    }

}
