package day02;

public class Operator {
    public static void main(String[] args) {
        int kor = 77;
        int eng = 87;
        int tot = 0;
        int ave = 0;
        opr(kor, eng, tot, ave);
    }

    public static void opr(int kor,int eng, int tot, int ave){

        tot = kor + eng;
        System.out.println("총점: " + tot);
        ave = (kor + eng) / 2;
        System.out.println("평균: " + ave);

    }
}
