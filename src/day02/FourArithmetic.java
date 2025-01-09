package day02;

public class FourArithmetic {

    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int result = 0;
        odd(a,b,result);
    }
    public static void odd(int a, int b, int result){

        result = a+b;
        System.out.println("a + b = " + result);
        result = a-b;
        System.out.println("a - b = " + result);
        result = a*b;
        System.out.println("a * b = " + result);
        result = a/b;
        System.out.println("a / b = " + result);


    }
}
