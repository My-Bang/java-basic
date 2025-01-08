import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // 1. 데이터 자유 입력

        Scanner in = new Scanner(System.in);
        System.out.println("first number input: ");
        int a = in.nextInt();   //1
        System.out.println("end number input: ");
        int b = in.nextInt();   //100
        int sum  = 0;

        // 2. 데이터 처리


        // 3. 데이터 결과 저장

        for (int i = a; i <= b; i++) {

            if(i % 2 == 0)
            {
                sum += i;
            }

        }

        // for문을 이용해서 1부터-100까지의 합을 구하는 결과 출력
        // 4. 결과 출력

        System.out.println("결과값 => " + sum);
    }


}
