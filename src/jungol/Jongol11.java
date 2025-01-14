package jungol;

import java.util.Scanner;

public class Jongol11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int count1 = 0;

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num % 3 == 0) {
                count++;
            }
            if (num % 5 == 0) {
                count1++;
            }
        }

        System.out.println("Multiples of 3 : " + count);
        System.out.println("Multiples of 5 : " + count1);

        scanner.close();
    }
}
