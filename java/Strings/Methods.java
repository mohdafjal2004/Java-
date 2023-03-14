package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Mohd Afjal";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('d'));// output: 3
        System.out.println(Arrays.toString(name.split(" ")));// Output:[Mohd, Afjal]
    }

}
