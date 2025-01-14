package jungol;

import java.util.Scanner;

public class Jongol12 {
    public static void main(String[] args) {
        float sum = 0;
        float result = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int s = input.nextInt();

            sum += s;
            result = sum / n;
        }
        System.out.printf("avg : %.1f\n" , result);

        if(result >= 80){
            System.out.println("pass");
        } else if (result < 80) {
            System.out.println("fail");

        }

    }


}

