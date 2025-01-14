package day05;

import java.util.Scanner;

public class ConditionEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num == 10){
            System.out.println("숫자가 10입니다");

        } else if (num == 15) {
            System.out.println("숫자가 15입니다");

        } else if (num ==20) {
            System.out.println("숫자가 20입니다");

        }else {
            System.out.println("숫자가 존재하지 않습니다");

        }
    }
}
