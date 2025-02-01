package day13.inheritance실습.level02;

public class CheckingAccount extends Account {
    private String cardNo;

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay(String cardNo, long amount) {
        if (this.cardNo.equals(cardNo) && amount < getBalance()) {
           setBalance(getBalance() - amount);
        }else
            System.out.println("지불이 불가능 합니다.");


    }

    @Override
    public void calcRate() {

    }
}
