package jungol;

import java.util.Scanner;

public class Jongol10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int sum = 0;
        if (a > 100) {

        } else {
            for (int i = a; i <= 100; i++) {
                sum += i;
            }
            System.out.println(sum);
        }

    }
}
