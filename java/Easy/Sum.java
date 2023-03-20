package Easy;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);

    }

    static int sum(int n) {
        // base-condtion
        if (n <= 1) {
            return 1;
        }

        // recursive-call
        return n + sum(n - 1);
    }

}
