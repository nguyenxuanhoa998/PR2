package Draft;
import java.util.Scanner;
public class japanFlag {
    // làm bài doubloon
    public static boolean isDoubloon(String input) {
        input = input.toLowerCase(); // Bỏ qua phân biệt hoa thường
        char[] chars = input.toCharArray();
        for(int i=0 ; i< chars.length; i++){
            int count = 0;
            for(int j=0; j< chars.length; j++){
                if(chars[i] == chars[j]){
                    count ++ ;
                }
            }
            if(count !=2){
                return false;
            }
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