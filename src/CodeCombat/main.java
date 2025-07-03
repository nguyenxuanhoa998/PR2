package CodeCombat;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Object> p = new ArrayList<>();
        p.add(10);
        p.add("đạt");
        p.add(90);
        p.add(20);
        StringBuilder c= new StringBuilder();
        c.append(p.get(1)+ " ");
        c.append(p.get(2));
        System.out.println(c);
        System.out.println(p);

    }
}
