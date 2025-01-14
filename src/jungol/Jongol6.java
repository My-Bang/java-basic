package jungol;

import java.util.Scanner;

public class Jongol6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("1. Korea\n" +
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number? ");
            int a = input.nextInt();

            switch (a){
                case 1:
                    System.out.println("\nSeoul\n");
                    break;
                case 2:
                    System.out.println("\nWashington\n");
                    break;
                case 3:
                    System.out.println("\nTokyo\n");
                    break;
                case 4:
                    System.out.println("\nBeijing\n");
                    break;

            }
            if (a >= 5 || a <= 0) {
                System.out.println("\nnone");
                break;
            }
        }
    }
}




