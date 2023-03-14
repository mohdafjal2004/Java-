package Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);// Internally println uses toString() method

        // But the default toString() method don't know about printing the Arrays, so to
        // print Arrays we use Arrays.toString() method especially made for Arrays
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));
    }
}
