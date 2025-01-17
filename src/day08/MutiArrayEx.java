package day08;

public class MutiArrayEx {
    public static void main(String[] args) {
        // 정수형 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //배열의 길이 1차원 배열의 길이(반의 수)
        System.out.println(scores.length + "scores[0]" + "scores[1]");
        System.out.println(scores[0][0]);
        // scores[1] 88출력
        System.out.println(scores[1][1]);
        for (int ban = 0; ban < scores.length; ban++) {


            for (int student = 0; student < scores.length; student++) { // 해당 반의 학생수 만큼 반복
                System.out.println(scores[ban][student]);       // 전체 scores 점수 출력


            }
            System.out.println();


            }


        //for-each 문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력하세요 (평균은 소수점 첫째자리까지)

        int sum = 0;
        int count = 0;
        for (int i : scores[1]) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.printf("2반 점수 합계: %d\n", sum);
        System.out.printf("2반 점수 평균: %.1f\n", average);
    }
}



