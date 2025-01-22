package moningTest_01_22;

public class Ex14_Ex15 {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Member user1 = new Member("홍길동", "hong");
        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
