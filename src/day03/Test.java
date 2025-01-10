package day03;

public class Test {
    public static void main(String[] args) {
        String str = " 나는 \t자바\n \\J2SE\\";
        System.out.println(str);

        System.out.println("서식 문자로 출력하는 방법입니다.\n이것은 문자열을 나타냅니다.");
        System.out.println("수를 출력할 때는 따옴표를 생략합니다.\n123\n6.500000");
        int a = 10;
        int b = 5;
        int result = a + b;
        String str1 = "수식을 출력하면 계산 결과가 출력됩니다.";
        String str2 = "내 생일은 2005년 6월 17일 입니다";
        System.out.printf("%s%n%d + %d = %d%n%s%n", str1, a, b, result, str2);

        // Java13 부터 테스트 블록 문법을 제공함
        String str3 = """
              subject score
             ==============
               korean    90
              english   100
             computer    80
             김진수 학생의 점수는 \
             최우수로 졸업하였습니다
              """;
        System.out.println(str3);

        byte bb = 10;
        int cc = bb;    // promotion
        long dd = cc;   // promotion
        float ff = dd;  // promotion
        double doub = ff;   // promotion
        System.out.printf("%f%n",doub);

        char charValue = 'A';
        int intValue = charValue;   // promotion
        System.out.println(charValue);
        System.out.println(intValue);


        byte byteValue = 65;
        int charValue1 = byteValue;


    }
}
