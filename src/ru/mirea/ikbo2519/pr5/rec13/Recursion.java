package ru.mirea.ikbo2519.pr5.rec13;

import java.util.Scanner;

public class Recursion {
    public static void recursion() {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        if (num_1 != 0) {
            System.out.println(num_1);
            int num_2 = sc.nextInt();
            if (num_2 != 0) {
                recursion();
            }
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
