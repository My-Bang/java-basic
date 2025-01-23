package day12;

public class SingletonHolder {
    private SingletonHolder(){

    }

    private static class SingleIntanceHolder{
        private static final SingletonHolder INSTANCE = new SingletonHolder();

    }
    public static SingletonHolder getInstance(){
        return SingleIntanceHolder.INSTANCE;
    }
}
