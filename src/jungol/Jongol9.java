package jungol;

import java.util.Scanner;

public class Jongol9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++){
            if(i % 2 == 0){
                sum += i;
                System.out.print(i + " ");
            }

        }
    }
}





