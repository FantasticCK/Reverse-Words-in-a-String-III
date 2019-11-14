package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0)
            return "";

        StringBuilder res = new StringBuilder();
        String[] sArr = s.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            StringBuilder sb = new StringBuilder(sArr[i]);
            res.append(sb.reverse());
            if (i != sArr.length - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}