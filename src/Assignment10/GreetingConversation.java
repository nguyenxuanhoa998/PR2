package Assignment10;

public class GreetingConversation {
    private static GreetingConversation intnace;
    public static void main(String[] args) {
        Person p1 = new Person(1, "Quan Dang");
        Person p2 = new Person(2, "Thuan Nguyen");
        Person p3 = new Person(3 , "Xuan Hoa");
        MobilePhone m1 = new MobilePhone("Apple", "M-ABC-123", Color.Yellow, 2008, false);
        MobilePhone m2 = new MobilePhone("Apple", "M-DUX-872", Color.Red, 2021, true);
        MobilePhone m3 = new MobilePhone("Samsung","M-DUX-872" , Color.Blue , 2022 , false);
        p1.setPhone(m1);
        p2.setPhone(m2);
        p3.setPhone(m3);
        p1.greet();
        p2.greet();
        p3.greet();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        // TODO: test more methods (all the public ones)
        GreetingConversation conversation = GreetingConversation.getInstance();
        System.out.println(conversation);
    }
    public static GreetingConversation getInstance(){
        if (intnace == null){
            intnace= new GreetingConversation();
        }
        return intnace;
    }
    public String toString(){
        return "đây là biến instance ";
    }
}
