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

       Student afjal = new Student();
       System.out.println(afjal.rollNo);

    }

    // create a class
    // for every single student
    class Student {

        int rollNo;
        String name;
        float marks;

    }
}
