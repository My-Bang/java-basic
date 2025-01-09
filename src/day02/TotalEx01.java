package day02;

import java.util.Scanner;

public class TotalEx01 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        FourArithmetic();


        Operator();
    }
    public static void FourArithmetic(){


        int result = 0;

        System.out.println("a를 입력하세요: ");
       int a = input.nextInt();

        System.out.println("b를 입력하세요: ");
       int b = input.nextInt();



        result = a+b;
        System.out.println("a + b = " + result);
        result = a-b;
        System.out.println("a - b = " + result);
        result = a*b;
        System.out.println("a * b = " + result);
        result = a/b;
        System.out.println("a / b = " + result);


    }
    public static void Operator(){


        System.out.println("국어 점수를 입력하시오: ");
        int kor = input.nextInt();
        System.out.println("영어 점수를 입력하시오: ");

        int eng = input.nextInt();
        int tot = 0;

        tot = kor + eng;
        System.out.println("총점: " + tot);

        double ave = (kor + eng) / 2;
        System.out.printf("평균: %.1f ", ave);

    }
}

