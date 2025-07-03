package Assignment05.ex1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ex3", "Tây Tựu");
        System.out.println(p); // gọi ToString ra

        Student c= new Student("Minh", "Thái Bình ", "computer science" , 2 , 3000);
        System.out.println(c);

        Staff d = new Staff(" Minh Ngọc ", " Thái Bình " ,  " Hanoi Law University " , 20.00);
        System.out.println(d);
        d.setName("Thu Trang");
        d.setSchool("Hanoi University");
        System.out.println(d);
    }
}
