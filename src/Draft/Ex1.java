package Draft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
           List<Integer> num = new ArrayList<>();
           num.add(100);
           num.add(30);
           num.add(40);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println(num);
    }
}
