package com.duguyuan;

import java.util.Scanner;

public class PalindromicNumber {

    public static final String IS = "该字符串是一个回文数";
    public static final String IS_NOT = "该字符串不是一个回文数";

    /**
     * 判断一个字符串是否为回文数
     */
    public static boolean isPalindromic(String str) {
        int length = str.length() - 1;
        int loopCount = str.length() / 2;
        for (int i = 0; i < loopCount; i++) {
            if (str.charAt(i) != str.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (isPalindromic(input)) {
            System.out.println(IS);
        } else {
            System.out.println(IS_NOT);
        }
        in.close();
    }

}
