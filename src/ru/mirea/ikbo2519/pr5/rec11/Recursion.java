package ru.mirea.ikbo2519.pr5.rec11;

import java.util.Scanner;

public class Recursion {
    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n >= 1) {
            if (m >= 1) {
                return recursion() + (n == 1 ? 1 : 0) + (m == 1 ? 1 : 0);
            } else {
                int k = in.nextInt();
                if (k >= 1) {
                    return recursion() + (n == 1 ? 1 : 0) + (k == 1 ? 1 : 0);
                } else {
                    return (n == 1 ? 1 : 0) + k;
                }
            }
        } else {
            if (m >= 1) {
                return recursion() + n + (m == 1 ? 1 : 0);
            } else {
                return n + m;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
