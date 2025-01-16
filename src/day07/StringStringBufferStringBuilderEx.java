package day07;
// 자바에서는 문자열을 처리할 때 자료형 클래스(String,StringBuffer, StringBuilder )
// 문자열을 다루는데 있어 공통적으로 사용되지만, 사용목적에 따라 쓰임새가 다르다.

// 기본 자바에서는 String 객체의 값을 변경할 수 없다. (Immutable 불변의 : 바뀔수 없다)
public class StringStringBufferStringBuilderEx {

    public static void main(String[] args) {

        int age = 40;
        String name = "신세계";
        System.out.println(name.hashCode());

        name = "신숙주";
        System.out.println(name.hashCode());

        String a = "Hello";
        System.out.println(a.hashCode());

        a = "Hello" + "JAVA";
        System.out.println(a.hashCode());

// 참조변수 a가 참조하는 메모리의 "Hello" 값에 "JAVA" 문자열을 더해서 String 객체의 값을 변경 시킨 것이다.
// 실제 메모리에서는 "Hello JAVA" 따로 만들고 참조변수 a를 새로운 주소값을 할당한다.
        // hashCode() : 객체의 메모리 번지를 이용해서 만든 해시코드를 반환한다
        // 문자열값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자열 데이터 객체를 대입하는 방식으로 운영하기 때문이다.

// 도대체 왜? 불변으로 설계 되었는가?
// 1. JVM 에서는 String Constrant Pool(문자열 상수풀 운영) 문자열을 상수(값 변경 불가)화 시켜서 다른 변수 또는 다른 객체 공유
// 2. 데이터가 불변하다면, Mulit-Thread 환경에서 동기화 문제 발생하지 않기 때문에 안정된 서비스를 제공할 수 있다.
// 3. 보안(Security)

        // String 주소할당 방식 : 1. 리터럴 할당 방식 2. new String() 할당 방식
    }


}
