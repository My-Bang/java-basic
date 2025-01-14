package jungol;

import java.util.Scanner;

public class Jongol4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            sum += num;
            count++;

            if (num >= 100) {
                break;
            }
        }

        double average = (double) sum / count;
        System.out.printf("%d\n%.1f", sum, average);
    }
}
