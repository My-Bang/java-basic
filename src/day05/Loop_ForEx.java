package day05;

public class Loop_ForEx {
    public static void main(String[] args) {

        for(int i =1; i <= 2; i++){
            for (int j = 1; j <= 2; j++){

                System.out.print("(" + i + "," + j + ")\n");


            }
        }

//        for (int dan = 2; dan <= 9; dan++){
//            System.out.printf("========%d단========\n", dan);
//            for (int i = 1; i <= 9; i++){
//                System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//            }
//        }

        for(int i = 2; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d ", j,i,i*j);

            }

        }

    }
}
