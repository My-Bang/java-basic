package moningTest_01_22;

import java.util.Date;

public class Account {

    final double MIN_BALANCE = 0;
    final double MAX_BALANCE = 1000000;

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if (balance < 0 && balance >1000000){

        }
    }


    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: "+ account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());


    }


}
