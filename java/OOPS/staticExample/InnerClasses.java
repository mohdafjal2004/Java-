package OOPS.staticExample;

// this outside class cannot be static,but inner class can be
public class InnerClasses {

    // Non static class placed inside the Main class gives error when accessing it
    // inside main method becoz it depend on
    // main class but make it static in this case
    // but same non-static class when placed outside the main class and make its
    // variables static ,gives no error
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args ) {
        Test a = new Test("Afjal");
        Test b = new Test("Rahul");

        // Both of these will give output as Rahul becoz value of a is changed inside
        // constructor when name is static
        // And will give respective outputs when name is non-static
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
