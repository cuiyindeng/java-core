package com.exercise.core.interview;

public class LongestSubString {

    public String getMaxLength(String str1, String str2) {
        String Longstr = "";
        String str = "";
        String longestStr = "";
        if (str1.length() < str2.length()) {
            str = str1;
            Longstr = str2;
        } else {
            str = str2;
            Longstr = str1;
        }
        int n = 0;
        //遍历str子集合;先遍历该字符串最长的子集，
        //若子集存在Longstr中则即为最长公共子串,终止遍历
        for (int i = 1; i <= str.length(); i++) {
            //for(int j=0; j<=str.length()-i; j++) {
            for (int j = str.length() - i; j >= 0; j--) {
                n++;
                System.out.println("n: " + n + ", substring: " + str.substring(j, j + i) + ", j: " + j + ", j + i: " + (j + i));
                if (Longstr.contains(str.substring(j, j + i))) {
                    longestStr = str.substring(j, j + i);
                    System.out.println("n: " + n + ", longestStr: " + longestStr);
                    break;
                }
            }
        }
        System.out.println("循环总次数:" + n);
        return longestStr;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubString().getMaxLength("1g2358kjdfdssdbcs", "1n2358kfgdsdbca"));
    }

}

