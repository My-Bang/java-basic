package day02;

public class CharEx {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;

        char c = ' '; // char타입의 변수에 어떤 문자도 대입하지 않고 초기화 할 목적으로 ''
        System.out.printf("%c %c %c %c",c1,c2,c3,c4);
    }
}
