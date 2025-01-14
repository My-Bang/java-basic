package jungol;

import java.util.Scanner;

public class Jongol2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        int sum= 0;

        while (i <= a){

            sum+=i;
            i++;
        }

        System.out.println(sum);

    }
}

