package day13.inheritance2;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone("LG", "PLK1023", "회색");

        String message = " 메세지입니다";
        phone.bell();
        phone.hangOn();
        phone.send(message);
        phone.receive(message);
        phone.hangUp();
        System.out.println();

        SmartPhone phone1 = new SmartPhone("사과", "사과15Pro", "흰색");
        phone1.setWifi(true);
        phone1.bell();
        phone1.hangOn();
        phone1.send(message);
        phone1.receive(message);
        phone1.hangUp();


    }
}
