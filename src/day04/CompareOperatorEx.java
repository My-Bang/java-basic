package day04;

public class CompareOperatorEx {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        boolean result1 = false;

        // 1. n1과 n2의 값이 같은지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 == n2);
        System.out.println(result1);

        // 2. n1과 n2의 값이 다른지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 != n2);
        System.out.println(result1);

        // 3. n1과 n2의 값이 n1이 n2보다 작거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 <= n2);
        System.out.println(result1);

        // 4. n1과 n2의 값이 n1이 n2보다 크거나 같은지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 >= n2);
        System.out.println(result1);

        // 5. n1과 n2의 값이 n1이 n2보다 작은지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 < n2);
        System.out.println(result1);

        // 6. n1과 n2의 값이 n1이 n2보다 큰지를 비교하여 결과를 boolean result1에 저장 후 result1출력
        result1 = (n1 > n2);
        System.out.println(result1);


        /* 7. jungol 연산자 - 자가진단 5번 #522
        두 개의 정수를 입력받아서
        첫 번째 줄에는 두 정수의 값이 같으면 1, 아니면 0을 출력하고,
        두 번째 줄에는 같지 않으면 1, 같으면 0을 출력하는 프로그램을 작성하시오.
         */

        System.out.println("========================문자 비교=======================");
        char ch1 = 'A';
        char ch2 = 'B';
        result1 = (ch1 < ch2);  // 65 < 66 => false
        System.out.println(result1);


        System.out.println("========================실수 비교=======================");
        int n5 = 1;
        double n6 = 1.0;
        result1 = (n5 == n6);
        System.out.println(result1);

        float n7 = 0.1f;
        n6 = 0.1;
        result1 = (n7 == n6);   // 0.1f = 0.1
        System.out.println(result1);
        result1 = ((float)n7 == n6);
        System.out.println(result1);


        // 정밀도 차이 때문에 (부동 소수점 방식) 실수 타입은 0.1을 정확히 표현하기 어려워서 다른 수로 본다. 0.1f == 0.1
    }
}
