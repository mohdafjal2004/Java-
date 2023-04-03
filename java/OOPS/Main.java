package OOPS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // store 5 students : {roll no, name,marks}
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // While creating object afjal, If we are not specifying the properties given in
        // Class Student
        // then that property will display the default value as per
        // datatype given in class
        Student afjal = new Student();

        // ? When using "this" keyword, internally at place of "this" keyword
        // ? afjal will render like this
        // afjal.rollNo = 13;
        // afjal.name = "Mohd Afjal";
        // afjal.marks = 87.6f;

        afjal.greeting();

        System.out.println(afjal.rollNo);
        System.out.println(afjal.name);
        System.out.println(afjal.marks);
    }
}

// create a class
// for every single student
class Student {
 
    int rollNo;
    String name; 
    float marks; 

    // We need a way to add the values of the above
    // properties object by object

    // we need one word to access every object:this keyword
    Student() {
        this.rollNo = 13;
        this.name = "Mohd Afjal";
        this.marks = 779.48f;

    }

    // function in template class
    void greeting() {
        System.out.println("My name is " + this.name);
    }

}
