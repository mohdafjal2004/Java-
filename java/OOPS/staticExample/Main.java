package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
        // Human afjal = new Human(24, "Mohd Afjal", 5000000, false);
        // Human mohit = new Human(24, "Mohit", 500000, true);
        // Human arpit = new Human(24, "Mohit", 500000, true);

        // //Since population is static, it can be accessed without using object
        // System.out.println(Human.population);
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        // greeting();
    }

    // this is ⁡⁢⁣⁢not⁡ ⁡⁢⁣⁢dependent⁡ on objects
    static void fun() {
        // For accessing non-static object inside static method , it is not allowed but it can
        // be done by creating a object inside static object
       
       Main obj = new Main();
        obj.greeting(); // You cannot use this becoz it requires an instance
        // but the function you are using it does not depend on instances;
    }

    // We know that something which is ⁡⁢⁣⁢not static⁡, belongs to an object
    void greeting() {
        System.out.println("Hello World");
    }

}
