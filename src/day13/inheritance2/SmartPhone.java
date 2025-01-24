package day13.inheritance2;

public class SmartPhone extends Phone {
    private boolean wifi;
    public SmartPhone(){
        super();
    }
    public SmartPhone(String bander, String model, String color){
        super(bander,model,color);
    }


public void deviceInfo(){
        super.getBander();
        super.getModel();
        super.getColor();
}
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        String model = super.getModel();
        System.out.println(model + " 의 wifi의 상태를 변경하였습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }


    public boolean isWifi() {
        return wifi;
    }
}
