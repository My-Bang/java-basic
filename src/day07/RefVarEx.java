package day07;

class Phone {
    String bander;
    String version;
    String model;

}

public class RefVarEx {
    public static void main(String[] args) {
//        int[] arryay1;
//        int[] arryay2;
//        int[] arryay3;
//
//        arryay1 = new int[] {1,2,3};
//        System.out.println(arryay1[0]);
//        System.out.println(arryay1[1]);
//        System.out.println(arryay1[2]);
//
//
//        for (int i = 0; i < arryay1.length; i++){
//            System.out.println(arryay1[i] + " " + arryay1.hashCode());
//        }
//
//        for (int i : arryay1){
//            System.out.println(i);
//        }
//        Phone phone1 = new Phone();
//        Phone phone2 = new Phone();
//        Phone phone3 = null;
//
//
//        System.out.println(phone3);
//        System.out.println(phone1 == phone2);
//        System.out.println(phone1 == phone3);
        //System.out.println(phone2 != phone3);

// 자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)라고 한다
        // 참조 변수에 null 상태에서 객체의 데이터나 메소드를 사용하려면 예외가 발생한다.
//        int[] intArray = new int[]{0, 0, 0, 0};
//        intArray[0] = 10;
//        for (int data : intArray) {
//            System.out.print(data + " ");
//
//        }
//        System.out.println();
//
//        for(int index = 0; index <= intArray.length-1; index++){
//            System.out.println(intArray[index]);
//        }

        String hobby = "여행";
        hobby = null;       // 기존의 "여행" 문자열이 저장된 heap영역의 주소값을 지웠다.

        String kind1 = "자동차";
        String kind2 = kind1;
        System.out.println(kind1.hashCode() + " " + kind2.hashCode());
        System.out.println(kind1 + " " + kind2);
        kind1 = null;
        System.out.println(kind1.hashCode() + " " + kind2.hashCode());
        System.out.println(kind1 + " " + kind2);


    }
}
