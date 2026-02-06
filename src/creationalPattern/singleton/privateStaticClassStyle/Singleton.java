package creationalPattern.singleton.privateStaticClassStyle;

public class Singleton {
    private Singleton(){}
    private static class Creator{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return Creator.instance;
    }

    public void doSomething(){
        System.out.println("Single obj from private static style");
    }
}
