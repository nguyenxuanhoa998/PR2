package CodeCombat;

public class cigar {
    public static Boolean cigarParty(int cigars, boolean isWeekend){
        if(isWeekend){
           return cigars >=40 ;
        }else{
            return cigars>= 40 && cigars <=60  ;
        }
    }
    public static void main (String [] args){
        System.out.print(cigarParty(70, false));


    }
}
