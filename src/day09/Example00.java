package day09;
// 짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해 보자
// 1. 메소드의 반환값이 있는 경우
// 2. 메소드의 반환값이 없는 경우
// 2. 메소드의 반환값이 없는 경우


import java.util.Scanner;
public class Example00 {

    public static String Method(int num){
        if(num %2  ==0){
            System.out.println("짝수입니다");
        }else {
            System.out.println("홀수입니다");
        }
        return "짝수";
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        Method(num);
        int num = 10;
        String name = Method(num) + "입니다";
        System.out.println(name);
        System.out.println(Method(num));


    }
}
