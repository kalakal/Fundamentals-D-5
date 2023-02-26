package com.fundamentals;


    public class SumOfThreeNumberZero {
        public static void main(String[] args) {
            int[] numbers = { 1, 4, -5, -2, -7, 3, 5, -5 };
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + "  ");

            }
            System.out.println(" ");
            System.out.println("Distinct triplet : ");
            getCount(numbers);

        }

        public static void getCount(int numbers[]) {
            int count = 0;
            for (int i = 0; i < numbers.length - 2; i++)
                for (int j = i + 1; j < numbers.length - 1; j++)
                    for (int k = j + 1; k < numbers.length; k++)
                        if (numbers[i] + numbers[j] + numbers[k] == 0) {
                            System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                            count++;
                        }
            System.out.println(" ");
            System.out.println("The number of triplet count is : " + count);
        }
}
