package day12;

public class ArrayCopyByForEx {
    public static void main(String[] args) {
        // 길이가 3인 배열 생성 후 초기화 : oldIntArray

        // 길이가 5인 배열 생성 후 길이가 3인 배열의 항목들을 옮겨야 한다.
        // 길이가 5인 배열에 옮긴 항목들이 잘 옮겨졌는지 항목을 확인(출력)
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];
        int[] newIntArray2 = new int[5];

        // 1. for문을 이용한 배열의 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + " ");
        }
        System.out.println();
        // code summary : 기존의 배열을 크기가 더 큰 배열로 값을 복사


        // 2. 자바 API System클래스에서 제공하는 arraycopy()를 이용한 방법
        System.arraycopy(oldIntArray, 0, newIntArray2, 0, oldIntArray.length);
        for (int number : newIntArray2) {
            System.out.print(number + " ");
        }

    }
}
