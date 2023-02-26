package com.fundamentals;

import java.util.Scanner;

public class PowerOfTwo {
    public static void findPower(int base, int exponent) {
        int bas = base;
        int expo = exponent;
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = base * power;
            System.out.print(power + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of base :");
        int base = sc.nextInt();
        System.out.println("Enter value of exponent :");
        int exponent = sc.nextInt();
        findPower(base, exponent);

    }

}
