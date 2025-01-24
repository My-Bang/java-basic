package day13.inheritance3;

public class Phone {
    // 멤버 변수
    private String bander;
    private String model;
    private String color;
    private String message;

    public Phone() {
        System.out.println("Phone이라는 객체를 생성하였다.");
    }

    public String getBander() {
        return bander;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}