package lec11;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void processEle(List<? extends A> elements) {
        for (A element : elements) {
            element.doA(); // Có thể gọi phương thức của lớp A
            if (element instanceof B) {
                ((B) element).doB(); // Nếu là B, có thể gọi phương thức của B
            }
            if (element instanceof C) {
                ((C) element).doC(); // Nếu là C, có thể gọi phương thức của C
            }
        }
    }

    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        listA.add(new A());
        processEle(listA);

        List<B> listB = new ArrayList<>();
        listB.add(new B());
        processEle(listB);

        List<C> listC = new ArrayList<>();
        listC.add(new C());
        processEle(listC);
    }
}