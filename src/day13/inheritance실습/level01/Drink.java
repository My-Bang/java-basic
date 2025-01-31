package day13.inheritance실습.level01;

public class Drink {
    String name;
    int price;
    int count;

    Drink() {

    }

    Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;

    }

    public static void printTitle() {
        System.out.println("상품명 \t단가 \t수량 \t금액");
    }

    public void printData() {
        System.out.printf("%s \t%d \t%d \t\t%d \n",name,price,count,getTotalPrice());
    }
}

