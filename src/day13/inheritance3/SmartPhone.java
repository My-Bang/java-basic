package day13.inheritance3;

public class SmartPhone extends Phone {
    public SmartPhone(){}
    public SmartPhone(String model, String color) {
        super();
        System.out.println("스마트폰 모델과 컬러" + super.getBander() + super.getModel() + super.getColor());

    }


}