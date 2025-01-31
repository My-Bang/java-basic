package day13.class실습;

public class Tv {
    String color;
    boolean power;
    int channel;

    Tv(){
        this.color = "black";
        this.power = false;
        this.channel = 0;
    }

    public void power() {
        if (!power){
            power = true;
        }else
            power = false;
    }
    public void channelUp() {
        channel++;
    }
    public void channelDown() {
        channel--;
    }
    public void print() {
        System.out.println("color : "+ color + "\t" + "power : " + power + "\t" + "channel : " + channel);
    }
}
