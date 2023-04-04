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

        Student king = new Student(21, "king", 78.46f);

        Student afjal = new Student();
        Student random = new Student(afjal);

        // Student random2 = new Student();

        // ? When using "this" keyword, internally at place of "this" keyword
        // ? afjal will render like this
        // afjal.rollNo = 13;
        // afjal.name = "Mohd Afjal";
        // afjal.marks = 87.6f;

        // afjal.changeName("Sonu");
        // afjal.greeting();

        System.out.println(afjal.rollNo);
        System.out.println(afjal.name);
        System.out.println(afjal.marks);

        // System.out.println(king.rollNo);
        // System.out.println(king.name);
        // System.out.println(king.marks);

        // System.out.println(random.rollNo);
        // System.out.println(random.name);
        // System.out.println(random.marks);

        // ? Understanding how refernce variable works with values in heap memory
        Student one = new Student();
        Student two = one;

        one.name = "Hugh Jackman";
        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student {

    int rollNo;
    String name;
    float marks;

    // function in template class
    void greeting() {
        System.out.println("My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    // We need a way to add the values of the above
    // properties object by object

    // we need one word to access every object:this keyword
    // Student() {
    // this.rollNo = 13;
    // this.name = "Mohd Afjal";
    // this.marks = 779.48f;

    // }

    // Student mohit = new Student(34,"Mohit",23.45f);
    // Constructor taking its own value,for different student
    Student(int rno, String name, float marks) {
        this.rollNo = rno;
        this.name = name;
        this.marks = marks;

    }

    // A Constructor taking values from another constructor
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;

    }

    // How to call a constructor from another constructor
    // internally: new Student(13,"default person",2324.43f)
    Student() {
        this(14, "This Person", 323.34f);

    }

}
