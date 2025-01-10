package day03;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x의 값 입력: ");
        String strX = input.nextLine();
        int a = Integer.parseInt(strX) + 10;
        System.out.println(a);
        // strX 변수값을 숫자 값으로 변경하여 int X에 저장하세요.
        int x = Integer.parseInt(strX);
        System.out.println("y의 값 입력: ");
        String strY = input.nextLine();
        int y = Integer.parseInt(strY);
        System.out.println(y);

        // 문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅 기능을 제공하는 각 래퍼클래스를 활용하여 변경

        while (true) {
            System.out.println("입력기능을 종료하고 싶으면 \"quit\" 입력하세요! ");
            System.out.println("입력 문자열: ");
            String data = input.nextLine();
            if (data.equals("quit")) {
                break;
            }

            System.out.println("입력된 문자열 출력: " + data);

        }
        System.out.println("프로그램 종료");

    }

}