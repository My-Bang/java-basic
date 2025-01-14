package Exercise3;

public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (65 <= ch && ch <= 122 || 48 <= ch && ch <=57) ? true : false;

        System.out.println(b);

    }
}