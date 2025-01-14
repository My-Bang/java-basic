package jungol;

import java.util.Scanner;

public class Jongol5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            if (a % 3 != 0) {

            } else if (a % 3 == 0) {
                int result = a / 3;
                System.out.println(result);
            }
            if (a == -1){
                break;
            }
        }
    }
}




