package day07;

public class StringEx1 {

    public static void main(String[] args) {

//        String ssn = "99011512345678";
//      char gender = ssn.charAt(6);
//      switch (gender){
//          case '1':
//          case '3':
//              System.out.println("남성입니다.");
//              break;
//          case '2':
//          case '4':
//              System.out.println("여성");
//              break;
//
//      }

        // 2. 문자열의 길이 : 문자열에서 문자의 전체개수를 얻고 싶다면, length() 메소드를 사용한다.
//        String subject = "Java Programming";
//        int length = subject.length();      // subject(문자열)의 길이를 세어서 센 값을 length에 저장한다.
//        System.out.println(subject + " " + length);

        // 3. 문자열 대체하기 : 문자열에서 특정 문자열을 다른 문자열로 대체할 때 replace()
        String oldstr = "자바 프로그래밍";
        String newstr = "혼자 공부하는 자바 프로그래밍";
        String printStr1 = oldstr.replace("자바", "JAVA");
        String printStr2 = newstr.replace("혼자 공부하는", "다 함께 공부하는");
        System.out.println(printStr1 + " " + printStr2);
//
//
//        // 4. 문자열 잘라내기 : 특정 위치의 문자열을 잘라내어 가져오고 싶을 때, subString() -
//        // subString(int beginIndex): 전달받은 인덱스부터 해당 문자열의 마지막 인덱스까지 잘라내기
//        // subString(int beginIndex, int endIndex) : 전달받은 인덱스부터 시작해서 endIndex까지 잘라내기
//        oldstr = "자바 프로그래밍";
//        newstr = "혼자 공부하는 자바 프로그래밍";
//        printStr2 = oldstr.substring(1);
//        System.out.println(printStr2);

        // 5. 문자열 찾기 : 특정 문자열의 위치를 찾고자 할 때 indexOf() 메소드 사용
        // indexOf()
//        int location = newstr.indexOf("울라라");
//        System.out.println(location);
//        String printStr4 = newstr.substring(11);
//        System.out.println(printStr4);
//
//        boolean printStr5 = newstr.contains("자바");
//        if (printStr5){
//            System.out.println("포함");
//        }else {
//            System.out.println("불포함");
//        }


        // 6. 문자열 분리 : 문자열이 구분자(delimiter : 공백)를 기준으로 잘라낼 때 split()
        String board = "1,제목,내용,작성자,파일";
        String[] tokens = board.split(",");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        System.out.println(tokens[4]);
        System.out.println("=====================");
        for (String data : tokens) {
            System.out.println(data);
        }
        System.out.println("=====================");

        for (int index = 0; index < tokens.length; index++) {
            System.out.println(tokens[index]);
        }

    }

}
