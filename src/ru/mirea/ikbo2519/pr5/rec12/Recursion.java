package ru.mirea.ikbo2519.pr5.rec12;

import java.util.Scanner;

public class Recursion {
    public static void recursion() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num != 0) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
            recursion();
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}
