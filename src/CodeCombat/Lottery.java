package CodeCombat;

public class Lottery {
    public static int blueTicket(int a, int b , int c ){
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;
        if(ab == 10 && ab > bc && ab> ac){
            return 10 ;
        }else if (bc == 10 && bc> ac && bc> ab){
            return 10 ;
        }else if (ac == 10 && ac> ab && ac> bc ){
            return 10 ;
        }else{
            return 0;
        }
    }
    public static void main (String [] args){
        System.out.print(blueTicket(9,1,0));
    }

}
