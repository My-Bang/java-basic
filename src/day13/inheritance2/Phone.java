package day13.inheritance2;

public class Phone {
    // 멤버 변수
    private String bander;
    private String model;
    private String color;
    private String message;

    public Phone() {
    }

    public Phone(String bander, String model, String color) {
        this.bander = bander;
        this.model = model;
        this.color = color;
    }

// 멤버 메소드

    // 벨이 울린다
    public void bell() {
        System.out.println("벨이 울린다.");
    }

    // 음성을 전송한다.
    public String send(String message) {
        System.out.println("보내는 사람" + message);
        return message;
    }


    // 전송된 음성을 상대방이 들을 수 있다.
    public void receive(String message) {
        System.out.println("받는 사람" + message);
    }

    // 벨이 울리면 전화를 받는다.
    public void hangOn() {
        System.out.println("전화를 받는다.");
    }

    //전화를 끊는다.
    public void hangUp() {
        System.out.println("전화를 끊는다.");
    }

    public String getModel() {
        return model;
    }

    public String getBander() {
        return bander;
    }

    public String getColor() {
        return color;
    }

    public String getMessage() {
        return message;
    }
}
