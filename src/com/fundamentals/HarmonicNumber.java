package com.fundamentals;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = sc.nextInt();
        double total = 0;
        for (double i = 1; i <= N; i++) {
            double x = (1 / i);
            total = total + x;
        }
        System.out.println(N + "th Harmonic number  " + total);
    }
}