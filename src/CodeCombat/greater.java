package CodeCombat;

public class greater {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        // Nếu bOk là true, chỉ cần kiểm tra c > b
        if (bOk) {
            return c > b;
        }
        // Nếu bOk là false, kiểm tra cả hai điều kiện b > a và c > b
        return b > a && c > b;
    }

    public static void main(String[] args) {
        // Các bài test
        System.out.println(inOrder(1, 2, 4, false)); // true
        System.out.println(inOrder(1, 2, 1, false)); // false
        System.out.println(inOrder(3, 1, 2, true));  // true
    }
}
