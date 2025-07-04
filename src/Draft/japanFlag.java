package Draft;
import java.util.Scanner;
public class japanFlag {
    // làm bài doubloon
    public static boolean isDoubloon(String input){
        input = input.toLowerCase();
        for (int i =0; i< input.length(); i++){
            char current = input.charAt(i);
            boolean alreadyChecked = false;
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == current) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) continue;

            // Đếm số lần xuất hiện
            int count = 0;
            for (int k = 0; k < input.length(); k++) {
                if (input.charAt(k) == current) {
                    count++;
                }
            }

            // Nếu khác 2 lần thì không phải doubloon
            if (count != 2) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        if (isDoubloon(str)) {
            System.out.println("✅ Đây là doubloon.");
        } else {
            System.out.println("❌ Không phải doubloon.");
        }
    }
}