package day13.inheritance실습.level01;

public class Alcohol extends Drink{
    double alcper;

    Alcohol(){

    }
    Alcohol(String name, int price, int count,double alcper){
        this.name = name;
        this.price = price;
        this.count = count;
        this.alcper = alcper;
    }
    public static void printTitle() {
        System.out.println("상품명(도수[%]) \t단가 \t수량 \t금액");
    }
    public void printData() {
        System.out.printf("%s(%.1f) \t\t%d \t%d \t\t%d\n",name,alcper,price,count,getTotalPrice());
    }
}
