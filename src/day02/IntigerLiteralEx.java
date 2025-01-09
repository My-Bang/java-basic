package day02;

//코드에서 프로그래머가 직접 입력한 값을 리터럴(Literal), 변수에 대입할 정수 리터럴 진수에 따라 작성해 본것이다
public class IntigerLiteralEx {
    public static void main(String[] args) {

        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?

        int x = 0b1011;     // 0B1011 = 11
        System.out.println(x);

// 10진수 11을 8진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int y = 013;
        System.out.println(y);

        // 16진수 0x로 시작하고 0~9 숫자 그대로 10~15 A~F, a~f로 표현한다.
        int z = 0XB;
        System.out.println(z);
       Lit();
    }

  /*  문제) 10진수
11 => 	2진수		var1
134	=> 8진수	var2
365	=> 10진수	var3
179	=> 16진수	var4
    리터럴 처리하여 출력은 10진수로

   */
    public static void Lit(){
        int var1 = 0b1011;
        System.out.println(var1);

        int var2 = 0206;
        System.out.println(var2);

        int var3 = 365;
        System.out.println(var3);

        int var4 = 0XB3;
        System.out.println(var4);

    }

}
