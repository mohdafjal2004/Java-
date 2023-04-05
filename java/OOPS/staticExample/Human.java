package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // It is common to all humans(objects), so it doesnot depend on objects

    static void message() {
        System.out.println("Hello world");
        // System.out.println(this.age);// ⁡⁢⁣⁢X⁡⁢⁣⁢XXX⁡⁡ No allowed becoz "this" keyword refers to an object
        // and the object which it is refering right now is non static
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
