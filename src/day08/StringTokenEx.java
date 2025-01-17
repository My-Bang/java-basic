package day08;
// StringTokenzer 클래스
// 문자열을 구분자를 기준으로 토큰(token)이라는 여러개의 문자열로 잘라낼 때 사용

import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "Welcom Java Programming";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("전체 토큰 수 :" + st.countTokens());

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}