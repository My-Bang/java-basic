package day03;

/* 강제 타입의 목적은 원래 값이 유지되면서 타입을 바꾸기 위해 사용한다.
작은 허용법위 타입에 저장될 수 있는 값을 가지고 강제타입 변환을 해야만
원래 목적을 달성할 수 있다.
*/
public class PromotionEx {

    public static void main(String[] args) {
        char charValue = '가';
        int intValue = charValue;
        char charValue1 = (char)intValue;
        // char 타입의 경우 int 타입으로 자동 변환되면 유니코드 값이 int 타입에 대입된다
        System.out.println("가 의 유니코드 값 = " + intValue);
        System.out.println(charValue1);


        intValue = 100;
        long longValue = intValue;

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        int intValue2 = 500;
        byte byteValue = (byte) intValue2;
        System.out.println(byteValue);  //127에서 -128로 돌아가서 500만큼

        long longValue1 = 300;
        int intValue1 = (int)longValue1;
        System.out.println(intValue1);

        // int -> char
        // int 타입은 char타입으로 자동 변환 되지 않고, (char)캐스팅해서 강제 변환해 주어야 한다
        // 주의 할 점: char타입의 허용범위인 0~65535 사이의 값만 원래 값으로 유지된다.

        int intValue3 = 97;
        char charValue2 = (char) intValue3;
        System.out.println(intValue3 + " " + charValue2);

        //실수 -> 정수의 강제 캐스팅은 소수점 이하 부분은 버려지고, 정수 부분만 저장한다.
        double doubleValue1 = 3.14;
        int intValue4 = (int)doubleValue1;
        System.out.println(intValue4);
        // 자바 컴파일러는 컴파일 단계에서 10+20 => 30 결과를 만들고 result변수에 30을 저장하는 바이트 코드를
        // 이는 실행 시 덧셈연산에 대한 절차가 없으므로 실행 성능을 높일 수 있다.
        // 다만, 정수 리터럴이 아닌 변수가 피 연산자로 사용되면 실행 시 연산을 수행한다.
        byte result = 10 + 20;
        int a = 100;
        int b = 200;
        int result1 = a + b;

    }
}
