package day05;

import java.util.Scanner;

public class Loop_StarEx {
    public static void main(String[] args) {


//        for (int i = 0; i <= 5; i++){
//            for(int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < 9 - (i*2); j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//
//            }
        Scanner s = new Scanner(System.in);
        System.out.print("길이 : ");

        int len = s.nextInt();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*len)-1-(i*2); j++) {     // 2*len - 1 은 첫번째줄의 별의 갯수를 의미함. -(i*2) 는 별이 두개씩 줄어듦을 의미
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}




