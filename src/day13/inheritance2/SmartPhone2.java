package day13.inheritance2;

public class SmartPhone2 extends SmartPhone {
boolean wifi1;
    public SmartPhone2(){
        super();
    }
    SmartPhone2 smartPhone2 = new SmartPhone2();


    public void setWifi(boolean wifi){
        wifi1 = super.isWifi();
        String model = super.getModel();
        System.out.println(model + " 의 wifi의 상태를 변경하였습니다.");

    }


}
