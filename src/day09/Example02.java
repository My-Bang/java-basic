package day09;

public class Example02 {

    public static void calculate(int x, double y) {
        System.out.printf("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율\n2 x %d x %f = %.2f", x,y,2*x*y);
    }

    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;
        calculate(x, y);
    }
}
