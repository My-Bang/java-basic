package day02;

import java.util.Scanner;

public class AddSum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int value = 10;
        int sum = 0;
        sum += value;
        System.out.println("숫자를 입력하세요: ");

        add(sum);
    }

    private static void add(int sum) {
        int value = input.nextInt();
        sum += value;
        System.out.println(sum);
    }
}
