package day10.car.dto;

public class Car1DTO {   // 자동차의 데이터와 기능
    private String model;       // null 초기화
    private String user;
    private int speed;          // 0 초기화

    public Car1DTO(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Car1DTO(String model, String user){
        this.model = model;
        this.user = user;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car1DTO{" +
                "model='" + model + '\'' +
                ", user='" + user + '\'' +
                ", speed=" + speed +
                '}';
    }
}
