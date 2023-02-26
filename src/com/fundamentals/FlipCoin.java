package com.fundamentals;
import java.util.Scanner;
public class FlipCoin {
    public double flipCoin(int trial) {
        int isHead = 1;
        int TotalHead = 0;
        int numberOfTimesFlip = trial;
        for (int flip=1; flip<=numberOfTimesFlip; flip++ ) {
            int coinCheck = (int) (Math.floor(Math.random() * 10) % 2);
            if ( coinCheck == isHead)
                System.out.println("Head");
            else
                System.out.println("Tail");

            TotalHead += coinCheck;
        }
        return TotalHead;
    }
    public void percentage(double TotalHead,int N) {
        double timesHead = TotalHead;
        double timesTail = N - timesHead;
        double headPercent =(timesHead*100)/N;
        double tailPercent =(timesTail*100)/N;
        System.out.println("Number of times head is :"+timesHead+"   And percentage of head is :"+headPercent);
        System.out.println("Number of times tail is :"+timesTail+"   And percentage of tail is :"+tailPercent);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Times Flip Coin");
        int N = sc.nextInt();
        FlipCoin FC = new FlipCoin();
        double TotalHead = FC.flipCoin(N);
        FC.percentage(TotalHead, N);



    }

}
