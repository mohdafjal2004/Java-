package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Afjal";
        String b = "Afjal";

        // ==
        System.out.println(a == b);// 𝘁𝗿𝘂𝗲
        // Becoz both variable 𝗮 and 𝗯 are pointing to 𝘀𝗶𝗻𝗴𝗹𝗲
        // 𝗼𝗯𝗷𝗲𝗰𝘁("𝗔𝗳𝗷𝗮𝗹") inside pool

        // But if we want to create different objects of same value,
        // use 𝗻𝗲𝘄 keyword, which will create
        // all the different objects outside pool

        String name = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name == name2);// 𝗳𝗮𝗹𝘀𝗲

        System.out.println(name.equals(name2));// 𝘁𝗿𝘂𝗲
    }
}
