package moningTest_01_22;

public class Printer {


    public void println(int a) {
        System.out.println(a);
    }

    public void println(boolean b) {
        System.out.println(b);
    }

    public void println(double c) {
        System.out.println(c);
    }

    public void println(String d) {
        System.out.println(d);
    }



    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }


}
