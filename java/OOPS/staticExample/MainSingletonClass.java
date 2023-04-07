package OOPS.staticExample;

public class MainSingletonClass {
    public static void main(String[] args) {
        // SingletonClass obj = new SingletonClass();
        // obj.num; // <= Not possible becoz SingletonClass is private
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

    }
}
