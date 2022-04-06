package com.company;

import java.util.Locale;
import java.util.Scanner;

public class StringMethod {

    public static void main(String[] args) {

//        boolean res = isPolidrome("A man, a plan, a canal: Panama");
//        System.out.println(res);
//
//    }
//    static boolean isPolidrome(String text) {
//
//        StringBuffer strBuffer = new StringBuffer();
//        text = text.toLowerCase();
//        text = text.replaceAll(",:", " ");
//        for (int i = text.length() - 1; i >= 0; i--) {
//            strBuffer.append(text.charAt(i));
//        }
//        return strBuffer.toString().equals(text);
//    }
//
//}
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




