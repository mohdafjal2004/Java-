package OOPsProperties.polymorphism;

public class Shapes {
   
    void area() {
        System.out.println("I am in shapes");
    }


    // When we use "final" keyowrd here, then this method will not be overriden in
    // its child and also this method will not be overriden
//    final void area() {
//         System.out.println("I am in shapes");
//     }
}
