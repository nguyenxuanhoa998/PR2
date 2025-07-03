package Assignment11;

import utils.NotPossibleException;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListIntegerLoop {
    private int length;
    private ArrayList<Integer> list;

    public ArrayListIntegerLoop() {
        this.length = 10; // Định nghĩa số phần tử
        this.list = new ArrayList<>();
    }

    public void Input() throws NotPossibleException {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 1; i <= length; i++) {
                System.out.println("Enter number at position " + i + ": ");
                int inputnum = sc.nextInt();
                list.add(inputnum);
            }
        } catch (Exception e) {
            throw new NotPossibleException("Invalid input");
        } finally {
            sc.close();
        }
    }

    public void printOutPut() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number " + (i + 1) + ": " + list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayListIntegerLoop intArrList = new ArrayListIntegerLoop();

        intArrList.Input();

        try {
            intArrList.Input();
        } catch (NotPossibleException e) {
            System.out.println(e.getMessage());
        }
        intArrList.printOutPut();
    }
}
