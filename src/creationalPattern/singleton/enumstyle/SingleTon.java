package creationalPattern.singleton.enumstyle;

public enum SingleTon {
    INSTANCE;
    public void doSomething(){
        System.out.println("Singleton object via Enum");
    }
}
