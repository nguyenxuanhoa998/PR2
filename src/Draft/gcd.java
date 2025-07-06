package Draft;

public class gcd {

    public static int GCD(int a, int b) {
        int n = Math.min(a, b);
        for (int i = n; i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(GCD(5,6)); // Output: 9
    }
}
