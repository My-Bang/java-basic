import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("연락처를 입력하세요 : ");
        String contact = scanner.nextLine();

        while (true) {
            System.out.println("***************************************");
            System.out.println("\t Welcome to Shopping Mall");
            System.out.println("\t Welcome to Book Market!");
            System.out.println("***************************************");
            System.out.println("1. 고객 정보 확인하기");
            System.out.println("2. 장바구니 상품 목록 보기");
            System.out.println("3. 장바구니 비우기");
            System.out.println("4. 장바구니에 항목 추가하기");
            System.out.println("5. 장바구니의 항목 수정하기");
            System.out.println("6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기");
            System.out.println("8. 종료");
            System.out.println("***************************************");
            System.out.print("메뉴 번호를 선택해주세요 : ");

            int menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("현재 고객 정보:");
                    System.out.println("이름: " + name);
                    System.out.println("연락처: " + contact);
                    System.out.println("***************************************");
                    break;
                case 2:
                    System.out.println("장바구니 상품 목록을 보여줍니다.");
                    break;
                case 3:
                    System.out.println("장바구니를 비웁니다.");
                    break;
                case 4:
                    System.out.println("장바구니에 항목을 추가합니다.");
                    break;
                case 5:
                    System.out.println("장바구니의 항목을 수정합니다.");
                    break;
                case 6:
                    System.out.println("장바구니의 항목을 삭제합니다.");
                    break;
                case 7:
                    System.out.println("영수증을 표시합니다.");
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
            }
        }
    }
}
