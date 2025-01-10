package day03;

public class PrimitiveAndStringEx {
    public static void main(String[] args) {

        // String -> 기본 값으로 변경하여 기본 타입 변수에 저장
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");


        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);


    // 정수 -> 문자열로 변환하여 값을 저장
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
    }
}
