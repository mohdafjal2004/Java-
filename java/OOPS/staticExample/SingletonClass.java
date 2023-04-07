package OOPS.staticExample;

public class SingletonClass {
    private SingletonClass() {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        // Check whether only one is created or not
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}
