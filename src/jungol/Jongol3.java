package jungol;

import java.util.Scanner;

public class Jongol3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("number? ");
            int a = input.nextInt();
            if (a < 0){
                System.out.println("negative number");
            }else if(a > 0){
                System.out.println("positive integer");
            }
            if (a == 0){
                break;
            }
        }
    }
}
