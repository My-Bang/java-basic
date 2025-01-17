package day08;

public class StringPerfoEx {
    public static void main(String[] args) {
        StringBuffer StringBuffer = new StringBuffer();
        StringBuilder StringBulider = new StringBuilder();

        new Thread(() -> {

            for (int i = 0; i < 100000; i++) {
                StringBuffer.append(1);
                StringBulider.append(1);
            }
        }).start();

        new Thread(() -> {

            for (int i = 0; i < 100000; i++) {
                StringBuffer.append(1);
                StringBulider.append(1);
            }
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println("StringBuffer.length : " + StringBuffer.length());
                System.out.println("StringBulider.length : " + StringBulider.length());

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();





    }
}
