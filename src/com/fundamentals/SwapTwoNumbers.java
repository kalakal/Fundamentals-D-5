package com.fundamentals;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int FirstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int SecondNumber = sc.nextInt();

        System.out.println("Before swaping First Number " + FirstNumber);
        System.out.println("Before swaping Second Number " + SecondNumber);

        FirstNumber = FirstNumber + SecondNumber;
        SecondNumber = FirstNumber - SecondNumber;
        FirstNumber = FirstNumber - SecondNumber;

        System.out.println("After swaping First Number " + FirstNumber);
        System.out.println("After swaping Second Number " + SecondNumber);
    }
}
