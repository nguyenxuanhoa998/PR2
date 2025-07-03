package Assignment02;

public class Activity_1 {
    public static void main(String [] args){
        int first = (int)(Math.random()*6+1);
        System.out.println("The first die comes up : " + first);
        int second = (int)(Math.random()*6 + 1);
        System.out.println("The second die comes up: " + second);
        int total = first + second ;
        System.out.println("Your total roll is : " + total);
    }
}
