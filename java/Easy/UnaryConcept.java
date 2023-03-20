package Easy;

public class UnaryConcept {
    public static void main(String[] args) {
        concept(5);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }
 
        System.out.println(n);
        // n-- vs --n
        // concept(n--);
        // It always keep printing n becoz first it print n and then substract
        // so it gives stack overflow error

        concept(--n);// 𝗜𝘁 𝗳𝗶𝗿𝘀𝘁 𝘀𝘂𝗯𝘀𝘁𝗿𝗮𝗰𝘁 𝗮𝗻𝗱 𝘁𝗵𝗲𝗻 𝗽𝗿𝗶𝗻𝘁 𝗻
    }

}
