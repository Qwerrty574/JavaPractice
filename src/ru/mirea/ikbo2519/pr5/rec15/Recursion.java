package ru.mirea.ikbo2519.pr5.rec15;

import java.util.Scanner;

public class Recursion {
    public static String recursion(long n) {
        if (n < 10) {
            return String.valueOf(n);
        }
        else {
            return n % 10 + " " + recursion(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(recursion(num));
    }
}
