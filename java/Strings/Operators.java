package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println("a" + "b");// 𝗢𝘂𝘁𝗽𝘂𝘁:ab

        System.out.println('a' + 'b');// 𝗢𝘂𝘁𝗽𝘂𝘁:195

        System.out.println((char) ('a' + 3));// 𝗢𝘂𝘁𝗽𝘂𝘁:d

        System.out.println("a" + 1);// 𝗢𝘂𝘁𝗽𝘂𝘁:a1
        // this is same as after a few steps: "a" + "1"
        // 𝗶𝗻𝘁𝗲𝗴𝗲𝗿 will be converted to 𝗜𝗻𝘁𝗲𝗴𝗲𝗿 that will call toString();

        System.out.println("Afjal" + new ArrayList<>());
        // Here ArrayList is 𝗼𝗯𝗷𝗲𝗰𝘁 so it will call its 𝘁𝗼𝗦𝘁𝗿𝗶𝗻𝗴() method
        // so 𝗢𝘂𝘁𝗽𝘂𝘁:[]
        // Overall Output: Afjal[]

        System.out.println("Afjal" + new Integer(56));
        // Here Integer is 𝗼𝗯𝗷𝗲𝗰𝘁 so it will call its 𝘁𝗼𝗦𝘁𝗿𝗶𝗻𝗴() method
        // so 𝗢𝘂𝘁𝗽𝘂𝘁:56
        // Overall Output: Afjal56

        // ⁡⁣⁢System.out.println(new Integer(56) + new ArrayList<>());⁡
        // Output will be ⁡⁢⁣⁢error⁡, becoz if using ⁡⁢⁣⁢+⁡ operator, there should be
        // atleast
        // 1 string in whole println method

        System.out.println(new Integer(56) + "" + new ArrayList<>());
        // Now it won't give any ⁡⁢⁣⁢error, becoz 1 String is present⁡
    }
}
