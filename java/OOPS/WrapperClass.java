package OOPS;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;// Here it is not an object

        Integer num = 45;// Here it is an object

        // Use of final keyword for primitives
        final int bonus = 3;// primitive datatypes like int ⁡⁢⁣⁢can't⁡ be modified

        // Use of final keyword for non-primitives
        final A afjal = new A("Mohd Afjal");
        afjal.name = "Sonu";// changing the value is allowed ⁡⁢⁢
        // afjal = new A("King");// reassiging is ⁡⁢⁣⁢not⁡ allowed

        A obj;
        for (int i = 0; i < 100000; i++) {
            obj = new A("Random name");
        }

    }

}

class A {
    final int num = 10;
    String name;

    // Constructor
    A(String name) {
        System.out.println("Object is created");
        this.name = name;
    }

    // Finalize method for handling the value manually whose object is destroyed
    // automatically
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
